package lisen1;


import java.util.Scanner;

public class Main {
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {


        Recursia12.m(1);
        System.out.print("\n");
        Recursia3.i(1);
        System.out.print("\n");
        System.out.print(ANSI_BLUE + Recursia4.j(1));


        System.out.print("\n");
        System.out.print("\n");

        System.out.println("№ числа Фибоначчи ");
        Scanner scanner4 = new Scanner(System.in);
        int k3 = Integer.parseInt(scanner4.nextLine());
        Recursia5.j(k3+1);







    }

    public static class Recursia12 {
        public static void m(int x) {
            System.out.print(" x= " + x);
            if ((2 * x + 1) < 20) {
                m(2 * x + 1);
            }
            System.out.print(ANSI_RED + "  x=" + x);
        }

    }

    public static class Recursia3 {

        private static int step = 0;

        public static void i(int x) {

            space();
            System.out.println(ANSI_GREEN + " " + x + "->");
            step++;
            if ((2 * x + 1) < 20) {
                i(2 * x + 1);
            }

            step--;
            space();
            System.out.println(" " + x + "->");

        }

        public static void space() {
            for (int i = 0; i < step; i++) {
                System.out.println("{Probel}");
            }

        }
    }

    public static class Recursia4 {

        public static int j(int i) {
            int resul;
            if (i == 1) return 1;
            else {
                resul = j(i - 1) * i;
                return resul;
            }
        }
    }

    public static class Recursia5 {


        public static void j(int n) {

            int[] f = new int[n];
            int[] f2 = new int[n];




            f[0] = 0;
            f[1] = 1;

            for (int i = 2, r=1; i < n; ++i) {

                f[i] = f[i - 1] + f[i - 2];
                r++;
                f2[r] = f[i];


                int re = f[i]+ f2[r-1];
                System.out.println( ANSI_GREEN+f[i]+ANSI_PURPLE+"+"+f2[r-1] +"="+re);

                Recursia5.Node node1 =null;
                for (int t = f[i]; t>=0; t--)
                {
                    node1 = new Recursia5.Node(t, node1);

                }


                Recursia5.Node ref = node1;
                while (ref!=null)
                {
                    System.out.print(ANSI_GREEN+"---"+ref.value+"\n");
                    ref = ref.next;
                }

            }


        }

        static class Node{
            public int value;
            public Node next;

            Node(int value, Node next)
            {
                this.value = value;
                this.next= next;
            }
        }

    }




}

