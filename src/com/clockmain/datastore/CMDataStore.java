package com.clockmain.datastore;

import com.clockmain.entities.ClockMain;

import java.util.ArrayList;
import java.util.List;

public class CMDataStore {
    List<ClockMain> clockMainList = new ArrayList<>();
    public void setClockMainList(String id, String name, int cost) {
        ClockMain clockMain = new ClockMain();
        clockMain.setcId(id);
        clockMain.setcName(name);
        clockMain.setCost(cost);
        clockMainList.add(clockMain);
    }
    public void sendClockMainList(){
        setClockMainList("C001", "Ajanta", 600);
        setClockMainList("C002", "Casio",200);
        setClockMainList("C003", "Sky", 400);
    }

//
    public List<ClockMain> clockMainList(){
        return clockMainList;
    }
}
