package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your price for the country #1?");
        int amount1 = Integer.parseInt(br.readLine());
        // String c1 = br.readLine();
        System.out.println("What is your price for the country #2?");
        int amount2 = Integer.parseInt(br.readLine());
        // String c2 = br.readLine();
        System.out.println("What is your price for the country #3?");
        int amount3 = Integer.parseInt(br.readLine());
        //  String c3 = br.readLine();
        System.out.println("How long for the country #1?");
        int amount4 = Integer.parseInt(br.readLine());
        // String t1 = br.readLine();
        System.out.println("How long for the country #1?");
        int amount5 = Integer.parseInt(br.readLine());
        // String t2 = br.readLine();
        System.out.println("How long for the country #1?");
        int amount6 = Integer.parseInt(br.readLine());
        // String t3 = br.readLine();
        System.out.println("Cost #1 is " + (amount1 * amount4));
        System.out.println("Cost #2 is " + (amount2 * amount5));
        System.out.println("Cost #3 is " + (amount3 * amount6));

    }
}
