package com.example.galaxyhut.models;
// Root class containing Collection object
public class NasaModel {
    private Collection collection;

    public NasaModel(Collection collection) {
        this.collection = collection;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
