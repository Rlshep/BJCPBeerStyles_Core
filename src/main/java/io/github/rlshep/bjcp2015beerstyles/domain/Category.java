package io.github.rlshep.bjcp2015beerstyles.domain;

import java.util.ArrayList;
import java.util.List;

public class Category implements Comparable {
    public final static String CURRENT_REVISION = "2015";
    private long id;
    private long parentId;
    private String categoryCode;
    private String name;
    private String revision;
    private String language;
    private Integer orderNumber = 0;
    private boolean bookmarked = false;
    private List<Section> sections = new ArrayList<Section>();
    private List<Category> childCategories = new ArrayList<Category>();
    private List<VitalStatistics> vitalStatisticses = new ArrayList<>();
    private List<Tag> tags = new ArrayList<>();

    @Override
    public int compareTo(Object another) {
        if (another instanceof Category) {
            Category c = (Category)another;
            return this.orderNumber.compareTo(c.getOrderNumber());
        }

        return 0;
    }

    public Category() {
        this.revision = CURRENT_REVISION;
    }

    public Category(Category clone) {
        this.categoryCode = clone.getCategoryCode();
        this.name = clone.getName();
        this.revision = clone.getRevision();
        this.language = clone.getLanguage();
        this.orderNumber = clone.getOrderNumber();

        for (Section cloneSection : clone.getSections()) {
            this.sections.add(new Section(cloneSection));
        }

        for (Category cloneCategory : clone.getChildCategories()) {
            this.childCategories.add(new Category(cloneCategory));
        }

        for (VitalStatistics cloneVitalStatistic : clone.getVitalStatisticses()) {
            this.vitalStatisticses.add(new VitalStatistics(cloneVitalStatistic));
        }

        for (Tag cloneTag : clone.getTags()) {
            this.tags.add(new Tag(cloneTag));
        }
    }

    public Category(Category clone, String categoryCode) {
        this.language = clone.getLanguage();
        this.revision = clone.getRevision();
        this.categoryCode = categoryCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public String getTruncatedCategoryCode() {
        String truncatedCategoryCode = categoryCode;

        int i = categoryCode.indexOf("-");

        if (i > 0) {
            truncatedCategoryCode = categoryCode.substring(0, i);
        }

        return truncatedCategoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public boolean isBookmarked() {
        return bookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        this.bookmarked = bookmarked;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public List<Category> getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(List<Category> childCategories) {
        this.childCategories = childCategories;
    }

    public List<VitalStatistics> getVitalStatisticses() {
        return vitalStatisticses;
    }

    public void setVitalStatisticses(List<VitalStatistics> vitalStatisticses) {
        this.vitalStatisticses = vitalStatisticses;
    }

    public boolean isParent() {
        return 0 >= parentId;
    }


    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
