package io.github.rlshep.bjcp2015beerstyles.domain;

public class Synonym {
    private String from;
    private String to;
    private String language;

    public Synonym(Synonym clone) {
        this.from = clone.getFrom();
        this.to = clone.getTo();
        this.language = clone.getLanguage();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
