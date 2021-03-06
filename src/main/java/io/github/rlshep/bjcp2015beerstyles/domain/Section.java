package io.github.rlshep.bjcp2015beerstyles.domain;

public class Section {
    private long id;
    private long categoryId;
    private String body;
    private long orderNumber;

    public Section() {
    }

    public Section(Section clone) {
        this.body = clone.getBody();
        this.orderNumber = clone.getOrderNumber();
    }

    public Section(long orderNumber) {
        this.orderNumber = orderNumber;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }
}
