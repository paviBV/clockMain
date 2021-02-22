package com.clockmain;

import com.clockmain.manager.CMManager;

public class Main {

    public static void main(String[] args) {

        CMManager cmManager = new CMManager();
        cmManager.getClockMainList();
        cmManager.singleClockMainList("C001");
        cmManager.updateClockMainList("C003");
        cmManager.deleteClockMainList("C001");
        
    }
}
