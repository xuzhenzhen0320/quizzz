package com.zte.quiz1;

import java.util.List;

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

    public double getPrice(List<Book> books){
        double price = 0;
        for (int i = 0;i < books.size();i++) {
            if(books.get(i).getType().equals("新书")){
                double newPrice = 0;
                for(int j = 0;j < books.get(i).getCount();j++){
                    newPrice += books.get(i).getPriceList().get(j);
                }
                price += newPrice*1.2;

            }
            else if(books.get(i).getType().equals("常规图书")){
                double normalPrice = 0;
                for(int j = 0;j < books.get(i).getCount();j++){

                    normalPrice += books.get(i).getPriceList().get(j);
                }
                price += normalPrice * 1.0;
            }
            else if(books.get(i).getType().equals("滞销图书")){
                double oldPrice = 0;
                for(int j = 0;j < books.get(i).getCount();j++){
                    oldPrice += books.get(i).getPriceList().get(j);
                }
                price += oldPrice * 0.6;
            }
            else{
                System.out.println("您输入的图书类型不合法。");
            }

        }
        return price;
    }
}
