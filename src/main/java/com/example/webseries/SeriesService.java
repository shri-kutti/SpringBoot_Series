package com.example.webseries;

import java.util.List;

public interface SeriesService {
    public String upsertSeriesH(SeriesModel series);

    public List<SeriesModel> getAllSeriesH();

    public SeriesModel getByIdH(Integer id);

    public List<SeriesModel> getBynameH(String name);

    public String deleteSeries(Integer id);


}
