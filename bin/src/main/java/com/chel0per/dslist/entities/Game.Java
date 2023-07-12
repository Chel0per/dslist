package com.chel0per.dslist.entities;

import java.util.Objects;

import java.jakarta.persistance.Entity;
import java.jakarta.persistance.Table;

@Entity
@Table(nome = "tb_game")
public class Game {

    private Long id;
    private String title;
    private int year;
    private String genre;
    private String platform;
    private String imgURL;
    private String shortDescription;
    private String longDescription;    
    
    public Game(){   
    }

    public Game(Long id, String title, int year, String genre, String platform, String imgURL, String shortDescription, String longDescription){   
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgURL = imgURL;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }


    




}