package com.example.webseries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeriesServiceImp implements SeriesService{

    @Autowired
    private SeriesRepository seriesRepo;

    @Override
    public String upsertSeriesH(SeriesModel series) {
        seriesRepo.save(series);
        return "Success";
    }

    @Override
    public List<SeriesModel> getAllSeriesH() {
        return seriesRepo.findAll();
    }

    @Override
    public SeriesModel getByIdH(Integer id) {
        Optional<SeriesModel> findById = seriesRepo.findById(id);

        if(findById.isPresent())
            return findById.get();
        else
            return null;
    }

    @Override
    public List<SeriesModel> getBynameH(String name) {
        return seriesRepo.findByName(name);
    }

    @Override
    public String deleteSeries(Integer id) {
        if(seriesRepo.existsById(id)){
            seriesRepo.deleteById(id);
            return "Deleted Successfully";
        } else{
            return "No record found";
        }
    }
}
