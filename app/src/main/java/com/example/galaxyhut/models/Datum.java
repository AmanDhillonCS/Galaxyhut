package com.example.galaxyhut.models;

import java.util.ArrayList;
import java.util.Date;

// Datum Class contains each image description, title, photographer, Array of keywords, location
// nasa_id, media_type, date created, center and ...
public class Datum {
    private String description;
    private String title;
    private String photographer;
    private ArrayList<String> keywords;
    private String location;
    private String nasa_id;
    private String media_type;
    private Date date_created;
    private String center;
    private String description_508;
    private String secondary_creator;

    public Datum(String description, String title, String photographer, ArrayList<String> keywords, String location, String nasa_id, String media_type, Date date_created, String center, String description_508, String secondary_creator) {
        this.description = description;
        this.title = title;
        this.photographer = photographer;
        this.keywords = keywords;
        this.location = location;
        this.nasa_id = nasa_id;
        this.media_type = media_type;
        this.date_created = date_created;
        this.center = center;
        this.description_508 = description_508;
        this.secondary_creator = secondary_creator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public ArrayList<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(ArrayList<String> keywords) {
        this.keywords = keywords;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNasa_id() {
        return nasa_id;
    }

    public void setNasa_id(String nasa_id) {
        this.nasa_id = nasa_id;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getDescription_508() {
        return description_508;
    }

    public void setDescription_508(String description_508) {
        this.description_508 = description_508;
    }

    public String getSecondary_creator() {
        return secondary_creator;
    }

    public void setSecondary_creator(String secondary_creator) {
        this.secondary_creator = secondary_creator;
    }
}
