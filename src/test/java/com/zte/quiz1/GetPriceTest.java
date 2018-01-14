package com.zte.quiz1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GetPriceTest {
    @Test
    public void getPrice() throws Exception {
        //测试用例1
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
        assertEquals(28,new GetPrice().getPrice(books1),0.001);

        //测试用例2
        List<Double> newPrice2 = new ArrayList<Double>();
        List<Double> normalPrice2 = new ArrayList<Double>();
        List<Double> oldPrice2 = new ArrayList<Double>();
        newPrice2.add(10.0);
        normalPrice2.add(10.0);
        oldPrice2.add(10.0);
        Book book4 = new Book("",1,newPrice2);
        Book book5 = new Book("hhh",1,normalPrice2);
        Book book6 = new Book("滞销图书",1,oldPrice2);

        List<Book> books2 = new ArrayList<Book>();
        books2.add(book4);
        books2.add(book5);
        books2.add(book6);
        assertEquals(-1,new GetPrice().getPrice(books2),0.001);

        //测试用例3
        List<Double> newPrice3 = new ArrayList<Double>();
        List<Double> normalPrice3 = new ArrayList<Double>();
        List<Double> oldPrice3 = new ArrayList<Double>();
        newPrice3.add(-1.2);
        normalPrice3.add(10.0);
        oldPrice3.add(10.0);
        Book book7 = new Book("新书",1,newPrice3);
        Book book8 = new Book("常规图书",1,normalPrice3);
        Book book9 = new Book("滞销图书",1,oldPrice3);

        List<Book> books3 = new ArrayList<Book>();
        books3.add(book7);
        books3.add(book8);
        books3.add(book9);
        assertEquals(-1,new GetPrice().getPrice(books3),0.001);

        //测试用例4
        List<Double> newPrice4 = new ArrayList<Double>();
        List<Double> normalPrice4 = new ArrayList<Double>();
        List<Double> oldPrice4 = new ArrayList<Double>();
        newPrice4.add(2.5);
        normalPrice4.add(10.0);
        oldPrice4.add(10.0);
        Book book11 = new Book("新书",2,newPrice4);
        Book book12 = new Book("常规图书",1,normalPrice4);
        Book book13 = new Book("滞销图书",1,oldPrice4);

        List<Book> books4 = new ArrayList<Book>();
        books4.add(book11);
        books4.add(book12);
        books4.add(book13);
        assertEquals(-1,new GetPrice().getPrice(books4),0.001);

        //测试用例5
        List<Double> newPrice5 = new ArrayList<Double>();
        List<Double> normalPrice5 = new ArrayList<Double>();
        List<Double> oldPrice5 = new ArrayList<Double>();
        newPrice5.add(2.5);
        normalPrice5.add(10.0);
        oldPrice5.add(10.0);
        Book book14 = new Book("新书",-2,newPrice5);
        Book book15 = new Book("常规图书",1,normalPrice5);
        Book book16 = new Book("滞销图书",1,oldPrice5);

        List<Book> books5 = new ArrayList<Book>();
        books5.add(book14);
        books5.add(book15);
        books5.add(book16);
        assertEquals(-1,new GetPrice().getPrice(books5),0.001);

        //测试用例6
        List<Double> newPrice6 = new ArrayList<Double>();
        List<Double> normalPrice6 = new ArrayList<Double>();
        List<Double> oldPrice6 = new ArrayList<Double>();
        newPrice6.add(2.5);
        newPrice6.add(2.3);
        normalPrice6.add(10.0);
        oldPrice6.add(10.0);
        Book book17 = new Book("新书",2,newPrice6);
        Book book18 = new Book("常规图书",1,normalPrice6);
        Book book19 = new Book("滞销图书",1,oldPrice6);

        List<Book> books6 = new ArrayList<Book>();
        books6.add(book17);
        books6.add(book18);
        books6.add(book19);
        assertEquals(21.76,new GetPrice().getPrice(books6),0.001);





    }

}