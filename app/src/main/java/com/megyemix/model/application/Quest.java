package com.megyemix.model.application;

public class Quest {

    private int point;
    private String description;
    private String date;

    public Quest(int point, String description, String date) {
        this.point = point;
        this.description = description;
        this.date = date;
    }

    public Quest() {
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
