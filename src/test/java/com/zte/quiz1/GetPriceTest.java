package com.zte.quiz1;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GetPriceTest {
    @Test
    public void getPrice() throws Exception {

        double normalPrice1 = 10;
        HashMap<String,Integer> map1 = new HashMap<String, Integer>();
        map1.put("新书",1);
        map1.put("常规图书",1);
        map1.put("滞销图书",1);
        assertEquals(28,new GetPrice().getPrice(map1,normalPrice1),0);

        double normalPrice2 = 8.8;
        HashMap<String,Integer> map2 = new HashMap<String, Integer>();
        map2.put("新书",56);
        map2.put("常规图书",100);
        map2.put("滞销图书",60);
        assertEquals(1788.1600000000003,new GetPrice().getPrice(map2,normalPrice2),0);

        double normalPrice3 = 5;
        HashMap<String,Integer> map3 = new HashMap<String, Integer>();
        map3.put("",1);
        map3.put("哈哈",1);
        map3.put("滞销图书",1);
        assertEquals(-1,new GetPrice().getPrice(map3,normalPrice3),0);

        double normalPrice4 = -10;
        HashMap<String,Integer> map4 = new HashMap<String, Integer>();
        map4.put("新书",1);
        map4.put("常规图书",1);
        map4.put("滞销图书",1);
        assertEquals(-1,new GetPrice().getPrice(map4,normalPrice4),0);

        double normalPrice5 = 10;
        HashMap<String,Integer> map5 = new HashMap<String, Integer>();
        map5.put("新书",-20);
        map5.put("常规图书",1);
        map5.put("滞销图书",1);
        assertEquals(-1,new GetPrice().getPrice(map5,normalPrice5),0);

        double normalPrice6 = 10;
        HashMap<String,Integer> map6 = new HashMap<String, Integer>();
        assertEquals(-1,new GetPrice().getPrice(map6,normalPrice6),0);

    }

}