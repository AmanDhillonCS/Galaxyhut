package com.example.galaxyhut.models;

// Link Class containing href (link for image), rel, render
public class Link {
    private String href;
    private String rel;
    private String render;

    public Link(String href, String rel, String render) {
        this.href = href;
        this.rel = rel;
        this.render = render;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getRender() {
        return render;
    }

    public void setRender(String render) {
        this.render = render;
    }



}
