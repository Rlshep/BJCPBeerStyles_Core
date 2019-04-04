package io.github.rlshep.bjcp2015beerstyles.domain;

public class VitalStatistics {
    private long id;
    private long categoryId;
    private double ogStart;
    private double ogEnd;
    private double fgStart;
    private double fgEnd;
    private int ibuStart;
    private int ibuEnd;
    private int srmStart;
    private int srmEnd;
    private double abvStart;
    private double abvEnd;
    private String header = "";

    public VitalStatistics() {
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

    public double getOgStart() {
        return ogStart;
    }

    public void setOgStart(double ogStart) {
        this.ogStart = ogStart;
    }

    public double getOgEnd() {
        return ogEnd;
    }

    public void setOgEnd(double ogEnd) {
        this.ogEnd = ogEnd;
    }

    public double getFgStart() {
        return fgStart;
    }

    public void setFgStart(double fgStart) {
        this.fgStart = fgStart;
    }

    public double getFgEnd() {
        return fgEnd;
    }

    public void setFgEnd(double fgEnd) {
        this.fgEnd = fgEnd;
    }

    public int getIbuStart() {
        return ibuStart;
    }

    public void setIbuStart(int ibuStart) {
        this.ibuStart = ibuStart;
    }

    public int getIbuEnd() {
        return ibuEnd;
    }

    public void setIbuEnd(int ibuEnd) {
        this.ibuEnd = ibuEnd;
    }

    public int getSrmStart() {
        return srmStart;
    }

    public void setSrmStart(int srmStart) {
        this.srmStart = srmStart;
    }

    public int getSrmEnd() {
        return srmEnd;
    }

    public void setSrmEnd(int srmEnd) {
        this.srmEnd = srmEnd;
    }

    public double getAbvStart() {
        return abvStart;
    }

    public void setAbvStart(double abvStart) {
        this.abvStart = abvStart;
    }

    public double getAbvEnd() {
        return abvEnd;
    }

    public void setAbvEnd(double abvEnd) {
        this.abvEnd = abvEnd;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
}