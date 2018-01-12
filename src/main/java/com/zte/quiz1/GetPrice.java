package com.zte.quiz1;

import java.util.HashMap;


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
public class GetPrice
{

    public double getPrice(HashMap<String,Integer> bookMap,double normalPrice){
        double price = 0;
        if(normalPrice < 0){
            System.out.println("您输入的价格不合法。");
            return -1;
        }
        if(bookMap.isEmpty()){
            System.out.println("您未输入图书类型及数量。");
            return -1;
        }
        for (int count:bookMap.values()) {
            if(count < 0){
                System.out.println("您输入的图书数量不合法。");
                return -1;
            }
        }
        for (String bookType:bookMap.keySet()) {
            if(bookType.equals("新书")){
                price += bookMap.get(bookType) * normalPrice * 1.2;
            }
            else if(bookType.equals("常规图书")){
                price += bookMap.get(bookType) * normalPrice * 1.0;
            }
            else if(bookType.equals("滞销图书")){
                price += bookMap.get(bookType) * normalPrice * 0.6;
            }
            else{
                System.out.println("您输入的图书类型不合法。");
                return -1;
            }
        }
        return price;
    }
}
