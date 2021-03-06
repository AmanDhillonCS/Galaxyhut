package com.example.galaxyhut.models;

public class CollectionLink {
    private String href;
    private String rel;
    private String prompt;

    public CollectionLink(String href, String rel, String prompt) {
        this.href = href;
        this.rel = rel;
        this.prompt = prompt;
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

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
