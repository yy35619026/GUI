package com.example.gui;
import java.awt.*;
import java.util.Scanner;

public class Traffic_Light_Controller {
    AI ai = new AI();
    Traffic_Light traffic_light = new Traffic_Light();
    Traffic_Light_time traffic_light_time = new Traffic_Light_time();
    private int light_time;
    private String lane;
    private boolean emergency;

    public int nsr;
    public int ewg;

    public int nsg;
    public int ewr;
    public int getLight_time() {
        return light_time;
    }



    public Traffic_Light_Controller() {
        emergency = ai.getEmergencyVehicle(); //模擬緊急車輛通過

        if (emergency == true){
            lane = ai.getLane();
//            System.out.println(lane);
            demermineState(lane, emergency, "Red");
        }else{
            lane = ai.compareVerticalTrafficFlow();
            determineTime(Traffic_Light_time.LaneType.valueOf(lane));
        }
    }


    public String getLane() {
        return lane;
    }

    public void demermineState(String lane, boolean bool, String color){
        traffic_light.changeLight(lane,bool,color);

        nsr = traffic_light.getNsredtime();
        ewg = traffic_light.getEwgreentime();

        nsg = traffic_light.getNsgreentime();
        ewr = traffic_light.getEwredtime();
//        System.out.println(getLane());

//        System.out.println(nsr);
//        System.out.println(esg);

//        System.out.println(lane);

    }

    public int getNsr() {
        return nsr;
    }

    public int getEwg() {
        return ewg;
    }

    public int getNsg() {
        return nsg;
    }

    public int getEwr() {
        return ewr;
    }
//第二段貼這邊

    public void determineTime(Traffic_Light_time.LaneType lane){
        traffic_light_time.changeTime(lane);
    }

    public void saveData(){

    }
}
