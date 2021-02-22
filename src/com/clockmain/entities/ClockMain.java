package com.clockmain.entities;
public class ClockMain {
    String cId;
    String cName;
    int cost;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ClockMain{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cost=" + cost +
                '}';
    }
}
