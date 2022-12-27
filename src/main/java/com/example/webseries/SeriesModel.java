package com.example.webseries;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="series_table")
public class SeriesModel {
    @Id
    private Integer id;
    private String name;
    private String seasons;
    private String episodes;
    private String rating;
}
