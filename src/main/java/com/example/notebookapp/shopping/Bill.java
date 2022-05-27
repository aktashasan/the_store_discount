package com.example.notebookapp.shopping;

public class Bill {

    public double billCalculate(double bill, double price){

        bill = price;

        if(bill >= 200){
            int discount = 0;
            discount = (int) (bill / 200);
            bill = bill - discount * 5;

        }

        price= bill;

        return price;
    }
}
