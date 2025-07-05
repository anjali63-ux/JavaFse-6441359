package com.handson.querydemo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Country {
    @Id
    private String coCode;
    private String coName;
    private int population;
    private Date independenceDate;

    // Getters and Setters
}
