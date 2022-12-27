package com.example.webseries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeriesRestController {

    @Autowired
    private SeriesService seriesService;

    @PostMapping("/addSeries")
    public ResponseEntity<String> addSeries(@RequestBody SeriesModel series){
        return new ResponseEntity<>(seriesService.upsertSeriesH(series), HttpStatus.ACCEPTED);
    }

    @GetMapping("/series")
    public ResponseEntity<List<SeriesModel>> getAllSeries(){
        return new ResponseEntity<>(seriesService.getAllSeriesH(),HttpStatus.OK);
    }

    @GetMapping("/series/id/{id}")
    public ResponseEntity<SeriesModel> getByID(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(seriesService.getByIdH(id),HttpStatus.OK);
    }

    @GetMapping("/series/name/{name}")
    public ResponseEntity<List<SeriesModel>> getByName(@PathVariable(name = "name") String name){
        return new ResponseEntity<>(seriesService.getBynameH(name),HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateSeries(@RequestBody SeriesModel series){
        return new ResponseEntity<>(seriesService.upsertSeriesH(series), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteSeries(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(seriesService.deleteSeries(id),HttpStatus.OK);
    }

}
