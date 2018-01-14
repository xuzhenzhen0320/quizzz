package com.zte.quiz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入：书的种类、数量和价格
 * 输出：价格
 * 例如：输入：新书 2
 *            10 20
 *           常规图书 1
 *           10
 *           滞销图书 3
 *           20 10 3
 *
 *      输出：65.8
 *
 */
public class Main {
    public static void main( String[] args )
    {
        List<Book> books = new ArrayList<Book>();
        System.out.println("请输入图书的类型与数量，用空格隔开:");
        Scanner sc = new Scanner(System.in);
        String s1[] = sc.nextLine().split(" ");
        String type1 = s1[0];
        int count1 = Integer.parseInt(s1[1]);

        System.out.println("请输入该类型图书每本书的价格，用空格隔开");
        List<Double> priceList1 = new ArrayList<Double>();
        String ss1[] = sc.nextLine().split(" ");
        for(int i = 0;i < ss1.length;i++){
            priceList1.add(Double.parseDouble(ss1[i]));
        }
        Book book1 = new Book(type1,count1,priceList1);
        books.add(book1);

        System.out.println("请输入图书的类型与数量，用空格隔开:");
        String s2[] = sc.nextLine().split(" ");
        String type2 = s2[0];
        int count2 = Integer.parseInt(s2[1]);

        System.out.println("请输入该类型图书每本书的价格，用空格隔开");
        List<Double> priceList2 = new ArrayList<Double>();
        String ss2[] = sc.nextLine().split(" ");
        for(int i = 0;i < ss2.length;i++){
            priceList2.add(Double.parseDouble(ss2[i]));
        }
        Book book2 = new Book(type2,count2,priceList2);
        books.add(book2);

        System.out.println("请输入图书的类型与数量，用空格隔开:");
        String s3[] = sc.nextLine().split(" ");
        String type3 = s3[0];
        int count3 = Integer.parseInt(s3[1]);

        System.out.println("请输入该类型图书每本书的价格，用空格隔开");
        List<Double> priceList3 = new ArrayList<Double>();
        String ss3[] = sc.nextLine().split(" ");
        for(int i = 0;i < ss3.length;i++){
            priceList3.add(Double.parseDouble(ss3[i]));
        }
        Book book3 = new Book(type3,count3,priceList3);
        books.add(book3);



        double price = new GetPrice().getPrice(books);
        System.out.println("结算价格为：" + price);
    }
}
