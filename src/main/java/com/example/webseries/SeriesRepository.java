package com.example.webseries;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;


public interface SeriesRepository  extends JpaRepository<SeriesModel, Serializable>{

    List<SeriesModel> findByName(String name);
}
