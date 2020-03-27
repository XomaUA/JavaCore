package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your price for the country #1?");
        int amount1 = Integer.parseInt(br.readLine());

        System.out.println("What is your price for the country #2?");
        int amount2 = Integer.parseInt(br.readLine());

        System.out.println("What is your price for the country #3?");
        int amount3 = Integer.parseInt(br.readLine());

        System.out.println("How long for the country #1?");
        int amount4 = Integer.parseInt(br.readLine());

        System.out.println("How long for the country #2?");
        int amount5 = Integer.parseInt(br.readLine());

        System.out.println("How long for the country #3?");
        int amount6 = Integer.parseInt(br.readLine());
        int Total1 = amount1 * amount4;
        int Total2 = amount2 * amount5;
        int Total3 = amount3 * amount6;
        int TotalTotal = Total1 * Total2 * Total3;
        System.out.println("Cost #1 is " + Total1);
        System.out.println("Cost #2 is " + Total2);
        System.out.println("Cost #3 is " + Total3);
        System.out.println("The total amount for all calls from 3 countries: " + TotalTotal);

    }
}
