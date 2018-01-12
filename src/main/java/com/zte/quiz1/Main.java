package com.zte.quiz1;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 输入：书的种类、数量和原始价格
 * 输出：价格
 * 例如：输入：新书 3 常规图书 2 滞销图书 5
 *
 *            10
 *
 *      输出：86
 *
 */
public class Main {
    public static void main( String[] args )
    {
        HashMap<String,Integer> bookMap = new HashMap<String, Integer>();

        System.out.println("请输入图书的类型与数量，用空格隔开:");
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        for(int i = 0;i < s.length;i++){
            String bookType = s[i];
            int count = Integer.parseInt(s[i + 1]);
            bookMap.put(bookType,count);
            i++;
        }

        System.out.println("请输入书的单价：");
        double normalPrice = sc.nextDouble();
        double price = new GetPrice().getPrice(bookMap,normalPrice);
        System.out.println("结算价格为：" + price);
    }
}
