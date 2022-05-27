package com.example.notebookapp.shopping;

public class Bill {

    public double billCalculate(double bill, double price){

        int discount = 0;
        bill = price;

        if(bill >= 200){
            discount = (int) (bill / 200);
            bill = bill - discount * 5;
        }

        price= bill;

        return price;
    }
}
