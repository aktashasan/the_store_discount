package com.example.notebookapp.shopping;

import java.util.Objects;
import java.util.Scanner;

public class Price {

    public void calculate(){

        Bill bill = new Bill();
        ProductList productList = new ProductList();

        System.out.println(productList.list());
        double resultBill = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("text product type: ");
        String product = scan.next();

        System.out.println("text price: ");
        double price = scan.nextDouble();

        if(!Objects.equals(product, "phone")){

            System.out.println("Do you have a card?\n(true or false):");
            Boolean card = scan.nextBoolean();

            System.out.println("Select an user status?\n(Gold_Card, Silver_Card or Nothing):");
            String user = scan.next();

            System.out.println("Are you affiliated with the store?\n(true or false):");
            Boolean affiliate = scan.nextBoolean();

            System.out.println("How many years have you been a customer?");
            int year = scan.nextInt();

            if(card==true && Objects.equals(user, "Gold_Card")){
                price = price - price * 30/100;
            }
            else if (card == true && Objects.equals(user, "Silver_Card")) {
                price = price - price * 20 / 100;
            }
            else if(affiliate == true){
                price  = price - price * 10/100;
            }
            else if (year>=2){
                price = price - price * 5/100;
            }

            System.out.println("Price of product :" + bill.billCalculate(resultBill,price));
        }else {
            System.out.println("Price of product :" + bill.billCalculate(resultBill, price));
        }
    }

}
