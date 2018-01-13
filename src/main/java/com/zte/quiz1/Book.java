package com.zte.quiz1;

import java.util.List;

public class Book {

    public String type;
    public int count;
    public List<Double> priceList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> price) {
        this.priceList = priceList;
    }

    public Book(String type,int count,List<Double> priceList){
        this.type = type;
        this.count = count;
        this.priceList = priceList;
    }




}
