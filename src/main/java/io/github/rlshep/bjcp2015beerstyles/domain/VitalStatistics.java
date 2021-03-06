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
    private double srmStart;
    private double srmEnd;
    private double abvStart;
    private double abvEnd;
    private String header = "";

    public VitalStatistics() {
    }

    public VitalStatistics(VitalStatistics clone) {
        this.ogStart = clone.getOgStart();
        this.ogEnd = clone.getOgEnd();
        this.fgStart = clone.getFgStart();
        this.fgEnd = clone.getFgEnd();
        this.ibuStart = clone.getIbuStart();
        this.ibuEnd = clone.getIbuEnd();
        this.srmStart = clone.getSrmStart();
        this.srmEnd = clone.getSrmEnd();
        this.abvStart = clone.getAbvStart();
        this.abvEnd = clone.getAbvEnd();
        this.header = clone.getHeader();

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

    public double getSrmStart() {
        return srmStart;
    }

    public void setSrmStart(double srmStart) {
        this.srmStart = srmStart;
    }

    public double getSrmEnd() {
        return srmEnd;
    }

    public void setSrmEnd(double srmEnd) {
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