package com.example.egeinfnav.model;

public class Task {

    private String name;
    private int num;
    private int icon;

    public Task(String name, int num, int icon) {
        this.name = name;
        this.num = num;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
