package com.clockmain.dao;

import com.clockmain.datastore.CMDataStore;
import com.clockmain.entities.ClockMain;

import java.util.List;

public class CMDao {
    CMDataStore cmDataStore = new CMDataStore();


    public void getClockMainList(){
        cmDataStore.sendClockMainList();
    }
    public List<ClockMain> clockMainList(){
        return cmDataStore.clockMainList();
    }


}
