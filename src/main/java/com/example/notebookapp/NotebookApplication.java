package com.example.notebookapp;

import com.example.notebookapp.shopping.Price;

public class NotebookApplication {

	public static void main(String[] args) {

		//SpringApplication.run(NotebookApplication.class, args);
		Price price = new Price();
		price.calculate();
	}

}
