package com.clockmain.manager;

import com.clockmain.dao.CMDao;
import com.clockmain.entities.ClockMain;

import java.util.ArrayList;
import java.util.List;

public class CMManager {
    CMDao cmDao =new CMDao();
    List<ClockMain> list=cmDao.clockMainList();


    public void getClockMainList(){
        cmDao.getClockMainList();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void singleClockMainList(String id) {
        System.out.println("Single");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getcId() == id)
                System.out.println(list.get(i));
        }
    }

    public void updateClockMainList(String id) {
        System.out.println("Update");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getcId() == id) {
                list.get(i).setcName("Rado");
                list.get(i).setCost(5000);
                System.out.println(list.get(i));
            }
        }
    }
    public void deleteClockMainList(String id) {
        System.out.println("Remove");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getcId()==id) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getcId()==id) {
                System.out.println("File is there");
                break;
            }else {
                System.out.println("File deleted");
                break;
            }
        }
    }
}
