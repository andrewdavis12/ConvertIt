package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to ConvertIt!");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.println("");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the country you wish to convert currency from:");
        String baseCurrency = br.readLine();
        System.out.println("Please enter the amount of money you wish to convert:");
        String baseAmount = br.readLine();

        System.out.println("Please enter the country you wish to convert currency to:");
        String newCurrency = br.readLine();

        System.out.println(baseCurrency);
        System.out.println(baseAmount);
        System.out.println(newCurrency);
        System.out.println();
        System.out.println();
    }
}