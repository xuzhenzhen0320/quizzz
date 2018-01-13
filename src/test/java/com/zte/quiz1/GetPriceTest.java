package com.zte.quiz1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GetPriceTest {
    @Test
    public void getPrice() throws Exception {

        List<Double> newPrice1 = new ArrayList<Double>();
        List<Double> normalPrice1 = new ArrayList<Double>();
        List<Double> oldPrice1 = new ArrayList<Double>();
        newPrice1.add(10.0);
        normalPrice1.add(10.0);
        oldPrice1.add(10.0);
        Book book1 = new Book("新书",1,newPrice1);
        Book book2 = new Book("常规图书",1,normalPrice1);
        Book book3 = new Book("滞销图书",1,oldPrice1);


        List<Book> books1 = new ArrayList<Book>();
        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        assertEquals(28,new GetPrice().getPrice(books1),0);



    }

}