package com.zte.quiz1;

import java.util.List;

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
public class GetPrice
{

    public double getPrice(List<Book> books){
        double price = 0;
        //判断输入的合法性

        for (Book book:books){
            if(!book.getType().equals("新书") && !book.getType().equals("常规图书") && !book.getType().equals("滞销图书")){
                System.out.println("您输入的图书类型不合法。");
                return -1;
            }
            if(book.getCount() < 0){
                System.out.println("您输入的图书数量不合法。");
                return -1;
            }
            if(book.getCount() != book.getPriceList().size()){
                System.out.println("您输入的图书数量与价格的数量不一致。");
                return -1;
            }

            for(int i = 0;i < book.count;i++){
                if(book.getPriceList().get(i) < 0){
                    System.out.println("您输入的书的价格不合法");
                    return -1;
                }
            }

        }
        //输入合法则开始计算
        for (Book book:books) {
                if (book.getType().equals("新书")) {
                    double newPrice = 0;
                    for (int i = 0; i < book.getCount(); i++) {
                        newPrice += book.getPriceList().get(i);
                    }
                    price += newPrice * 1.2;

                } else if (book.getType().equals("常规图书")) {
                    double normalPrice = 0;
                    for (int i = 0; i < book.getCount(); i++) {
                        normalPrice += book.getPriceList().get(i);
                    }
                    price += normalPrice * 1.0;
                } else if (book.getType().equals("滞销图书")) {
                    double oldPrice = 0;
                    for (int i = 0; i < book.getCount(); i++) {
                        oldPrice += book.getPriceList().get(i);
                    }
                    price += oldPrice * 0.6;
                }
        }
        return price;
    }
}
