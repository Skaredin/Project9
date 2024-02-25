package lisen5;


import java.util.Scanner;

public class Mein {

    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args) {
        for(int i =0; 3>=i; i++) {
            System.out.println("\n В ведите число ");
            Scanner scanner4 = new Scanner(System.in);
            int k3 = Integer.parseInt(scanner4.nextLine());
            j(k3);
        }


    }


    public static void j(int n) {


       Node node1 = null;

        for (int t = n; t >= 0; t--) {
            node1 = new Node(t, node1);

        }


        Node ref = node1;

        while (ref != null) {
            System.out.print(ANSI_GREEN  + ref.value + " ");
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
