package lisen3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Mein {

    public static void main(String[] args) {
        System.out.println("Ввидите целое число ");
        Scanner scanner4 = new Scanner(System.in);
        int k3 = Integer.parseInt(scanner4.nextLine());
        j(k3);

    }

    public static void j(int n) {


        int[] range = IntStream.rangeClosed(1, n).toArray();

        if (0 <= n) {

            System.out.print(Arrays.toString(range));

        }

    }

}

