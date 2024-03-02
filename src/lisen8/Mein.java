package lisen8;

import java.util.Scanner;

public class Mein {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    static String TXT = "";
    public static void main(String[] args) {


        System.out.println("\n •\tТекст который будем менять");
        Scanner scanner0 = new Scanner(System.in);
        String k0 = scanner0.nextLine();

        System.out.println("\n •\tввод с головы createHead();");
        Scanner scanner1 = new Scanner(System.in);
        String k1 = scanner1.nextLine();
        System.out.println("\n •\tввод с хвоста createTail();");
        Scanner scanner2 = new Scanner(System.in);
        String k2 = scanner2.nextLine();

        k0 =AddFirst1(k1, k0);
       System.out.println(ANSI_GREEN+k0);
        k0 =AddLast1(k2, k0);
        System.out.println(ANSI_GREEN+k0);
        k0 =RemoveFirst(k0);
        System.out.println("•\tудаление элемента с головы списка RemoveFirst():  "+ANSI_RED+k0);
        k0 =RemoveLast(k0);
        System.out.println("•\tудаление последнего элемента списка RemoveLast():  "+ANSI_RED+k0);




        System.out.println("\n •\tввод с головы createHeadRec()");
        Scanner scanner3 = new Scanner(System.in);
        String k3 = scanner3.nextLine();
        System.out.println("\n •\tввод с хвоста createTailRec();");
        Scanner scanner4 = new Scanner(System.in);
        String k4 = scanner4.nextLine();

        AddFirst2(k3);
        AddLast2(k4);

    }


    static int save1 = 0;
    static int save2 = 0;
    private static String AddFirst1(String decoder, String decoder2) {

        String se = "";
        StringBuilder sb = new StringBuilder(decoder);
        int count = decoder2.length();
        System.out.println(count);
        for(int i=0;i<1;i++){
            sb.insert(count+1, decoder2);
        }
        se = String.valueOf(sb);
        save1 = count;
        return se;
    }

    private static String AddLast1(String decoder, String decoder2) {

        save2 = decoder.length();
        String dd = decoder2+decoder;
        return dd;
    }
    private static String RemoveFirst(String decoder) {

        return decoder.substring(save1+1, decoder.length()-1);

    }

    private static String RemoveLast(String decoder) {


        return  decoder.substring(0, decoder.length() - save2);
    }



    private static String AddFirst2(String decoder) {

        return decoder;
    }
    private static String AddLast2(String decoder) {

        return decoder;
    }
}
