package io.github.rlshep.bjcp2015beerstyles.domain;

public class VitalStatistic {
    private long id;
    private long categoryId;
    private String type = "";
    private String header = "";
    private String notes = "";
    private double low;
    private double high;

    public VitalStatistic() {
    }

    public VitalStatistic(VitalStatistic clone) {
        this.type = clone.getType();
        this.header = clone.getHeader();
        this.notes = clone.getNotes();
        this.low = clone.getLow();
        this.high = clone.getHigh();
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

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}