package com.example.galaxyhut.models;

import java.util.ArrayList;

public class Item {
    private String href;
    private ArrayList<Datum> data;
    private ArrayList<Link> links;

    public Item(String href, ArrayList<Datum> data, ArrayList<Link> links) {
        this.href = href;
        this.data = data;
        this.links = links;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ArrayList<Datum> getData() {
        return data;
    }

    public void setData(ArrayList<Datum> data) {
        this.data = data;
    }

    public ArrayList<Link> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<Link> links) {
        this.links = links;
    }
}
