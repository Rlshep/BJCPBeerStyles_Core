package io.github.rlshep.bjcp2015beerstyles.domain;

public class VitalStatistics {
    private long id;
    private long categoryId;
    private String type = "";
    private String header = "";
    private String notes = "";
    private double start;
    private double end;

    public VitalStatistics() {
    }

    public VitalStatistics(VitalStatistics clone) {
        this.type = clone.getType();
        this.header = clone.getHeader();
        this.notes = clone.getNotes();
        this.start = clone.getStart();
        this.end = clone.getEnd();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}