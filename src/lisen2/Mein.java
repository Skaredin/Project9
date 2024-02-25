package lisen2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mein {

    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println(ANSI_RED+"В ведите целое число");

        int num = in.nextInt();
        System.out.print(ANSI_GREEN+"Перевод в : ");
        decToBin(num);
    }

    private static int decToBin(int n){

        if(n > 0){
           int re = decToBin(n/2);

            System.out.print(n%2);

        }


        return n;
    }
}