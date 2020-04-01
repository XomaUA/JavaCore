package com.company;
import java.util.Scanner;

 enum Http {
    ACCEPETED_202, FOUND_302, PERMANENT_REDIRECT_308, BAD_REQUEST_400, NOT_FOUND_404, SERVICE_UNAVAILABLE_503, NOT_EXTENDED_510;
}
public class Main {


    public static void main(String[] args) {
        Scanner valera = new Scanner(System.in);
        System.out.println("Input your first number: ");
        float x1 = valera.nextFloat();
        System.out.println("Input your second number: ");
        float x2 = valera.nextFloat();
        System.out.println("Input your third number: ");
        float x3 = valera.nextFloat();
        if (x1 >= -5 && x1 <= 5) {
            System.out.println("The number one is WITHIN the range");
        } else {
            System.out.println("The number one is OUT of the range");
        }
        if (x2 >= -5 && x2 <= 5) {
            System.out.println("The number two is WITHIN the range");
        } else {
            System.out.println("The number two is OUT of the range");
        }
        if (x3 >= -5 && x3 <= 5) {
            System.out.println("The number three is WITHIN the range");
        } else {
            System.out.println("The number three is OUT of the range");
        }
        System.out.println("PLEASE CONTINUE ↓↓↓↓↓↓\nInput your first integer: ");
        int x4 = valera.nextInt();
        System.out.println("Input your second integer: ");
        int x5 = valera.nextInt();
        System.out.println("Input your third integer: ");
        int x6 = valera.nextInt();
        if (x4 > x5 && x4 > x6) {
            System.out.println("First integer is the greatest!\n");
        }
        if (x5 > x4 && x5 > x6) {
            System.out.println("Second integer is the greatest!\n");
        }
        if (x6 > x5 && x6 > x4) {
            System.out.println("Third integer is the greatest!\n");
        }
       Http H1 = Http.ACCEPETED_202;
       Http H2 = Http.FOUND_302;
       Http H3 = Http.PERMANENT_REDIRECT_308;
       Http H4 = Http.BAD_REQUEST_400;
       Http H5 = Http.NOT_FOUND_404;
       Http H6 = Http.SERVICE_UNAVAILABLE_503;
       Http H7 = Http.NOT_EXTENDED_510;

       System.out.println("HTTP Codes to be presented↓↓↓\n");
       System.out.println(H1);
       System.out.println(H2);
       System.out.println(H3);
       System.out.println(H4);
       System.out.println(H5);
       System.out.println(H6);
       System.out.println(H7);

    }
}




