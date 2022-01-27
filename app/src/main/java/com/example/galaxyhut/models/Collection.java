package com.example.galaxyhut.models;

import java.util.ArrayList;

public class Collection {
    private String version;
    private String href;
    private ArrayList<Item> items;
    private Metadata metadata;
    private ArrayList<CollectionLink> links;

    public Collection(String version, String href, ArrayList<Item> items, Metadata metadata, ArrayList<CollectionLink> links) {
        this.version = version;
        this.href = href;
        this.items = items;
        this.metadata = metadata;
        this.links = links;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public ArrayList<CollectionLink> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<CollectionLink> links) {
        this.links = links;
    }
}
