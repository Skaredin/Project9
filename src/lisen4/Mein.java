package lisen4;

import lisen1.Main;

import java.util.Scanner;

public class Mein {
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Node r1 = null;
        Node r2= null;
        Node r3= null;
        Node r4= null;







            System.out.println("В видите число");
            Scanner scanner4 = new Scanner(System.in);
            String k1 = String.valueOf(Integer.parseInt(scanner4.nextLine()));
            int[] newGuess = new int[k1.length()];
            for (int d = 0; d < k1.length(); d++)
            {
                newGuess[d] = k1.charAt(d) - '0';
            }

            r1= new Node(newGuess[0], null);
            r2 = new Node(newGuess[1], null);
            r3 = new Node(newGuess[2], null);
            r4 = new Node(newGuess[3], null);


        Node node = r1;
        Node node1 =r2;
        Node node2 = r3;
        Node node3 = r4;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;

        Node ref = node;

        while (ref != null) {
            System.out.print(ANSI_GREEN + ref.value + " ");
            ref = ref.next;
        }
    }


    static class Node {
        public int value;
        public Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}


