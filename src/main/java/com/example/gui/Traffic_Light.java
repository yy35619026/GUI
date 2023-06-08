package com.example.gui;

import java.awt.*;


public class Traffic_Light {

    Traffic_Light_time traffic_light_time = new Traffic_Light_time();

    public int nsgreentime;
    public int nsredtime;
    public int ewgreentime;
    public int ewredtime;

    public Traffic_Light(){

        traffic_light_time.restTime();

        this.nsgreentime = traffic_light_time.nsgreentime;
        this.nsredtime = traffic_light_time.nsredtime;
        this.ewgreentime = traffic_light_time.ewgreentime;
        this.ewredtime = traffic_light_time.ewredtime;


    }

    public void changeLight(String lane,boolean bool,String color){

        if(lane =="Vertical"  && bool == true && color=="Red"){

            ewredtime = ewredtime+20;
            nsgreentime = nsgreentime+20;



            System.out.format("-----緊急車輛通過-----\n");

            System.out.format("\033[0;31m更改--東西向車道--紅燈\033[0m%n");
            System.out.format("\033[0;31m延長紅燈--東西向車道--紅燈時間%d秒\033[0m%n",ewredtime);


            System.out.format("\33[0;32m更改--南北向車道--綠燈\33[0m%n");
            System.out.format("\33[0;32m延長--南北向車道--綠燈時間%d秒\33[0m%n",nsgreentime);

        }else if(lane =="Parallel"  && bool == true && color=="Red"){

            nsredtime = nsredtime+20;
            ewgreentime = ewgreentime+20;

            System.out.format("-----緊急車輛通過-----\n");

            System.out.format("\033[0;31m更改--南北向車道--紅燈\033[0m%n");
            System.out.format("\033[0;31m延長紅燈--南北向車道--紅燈時間%d秒\033[0m%n",nsredtime);


            System.out.format("\33[0;32m更改--東西向車道--綠燈\33[0m%n");
            System.out.format("\33[0;32m延長--東西向車道--綠燈時間%d秒\33[0m%n",ewgreentime);

        }else if (lane =="Vertical"  && bool == true && color=="Green"){

            nsgreentime = nsgreentime +20;
            ewredtime = ewredtime+20;

            System.out.format("-----緊急車輛通過-----\n");

            System.out.format("\33[0;32m延長--南北向車道--綠燈時間%d秒\33[0m%n",nsgreentime);
            System.out.format("\033[0;31m延長--東西向車道--紅燈時間%d秒\033[0m%n",ewredtime);

        }else if(lane =="Parallel"  && bool == true && color=="Green"){

            ewgreentime = ewgreentime+20;
            nsredtime = nsredtime+20;

            System.out.format("-----緊急車輛通過-----\n");

            System.out.format("\33[0;32m延長--東西向車道--綠燈時間%d秒\33[0m%n",ewgreentime);
            System.out.format("\033[0;31m延長--南北向車道--紅燈時間%d秒\033[0m%n",nsredtime);

        }else {
            System.out.println("無緊急車輛通過,東西南北向燈號皆維持不變");
        }



//        System.out.println(nsredtime);
//        System.out.println(ewgreentime);

    }

    public int getNsgreentime() {
        return nsgreentime;
    }

    public int getEwredtime() {
        return ewredtime;
    }

    public int getNsredtime() {
        return nsredtime;
    }

    public int getEwgreentime() {
        return ewgreentime;
    }



}

