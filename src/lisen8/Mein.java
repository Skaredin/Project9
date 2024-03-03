package lisen8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mein {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public String TXT ;

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


        System.out.println(ANSI_PURPLE+"\nа) с использованием цикла:");
        k0 =AddFirst1(k1, k0);
        System.out.println(ANSI_GREEN+"•\tдобавление элемента в начало списка AddFirst(): "+ANSI_RED+k0+ANSI_GREEN+" Строка добавлена эта ("+ANSI_RED+k1+ANSI_GREEN+")");
        k0 =AddLast1(k2, k0);
        System.out.println(ANSI_GREEN+"•\tдобавление элемента в конец списка AddLast(): "+ANSI_RED+k0+ANSI_GREEN+" Строка добавлена эта ("+ANSI_RED+k2+ANSI_GREEN+")");
        k0 =RemoveFirst(k0);
        System.out.println(ANSI_GREEN+"•\tудаление элемента с головы списка RemoveFirst(): "+ANSI_RED+k0+ANSI_GREEN+" Строка удалена эта ("+ANSI_RED+k1+ANSI_GREEN+")");
        k0 =RemoveLast(k0);
        System.out.println(ANSI_GREEN+"•\tудаление последнего элемента списка RemoveLast(): "+ANSI_RED+k0+ANSI_GREEN+" Строка удалена эта ("+ANSI_RED+k2+ANSI_GREEN+")");
        System.out.println(ANSI_PURPLE+"\nб) с использованием рекурсии:");

        toStringRec();




    }


    static int save1 = 0;
    static int save2 = 0;

    static String save1String ;
    static String save2String ;
    static String save3String ;
    static List< String> list = new ArrayList<>();


    private static String AddFirst1(String decoder, String decoder2) {

        save1String = decoder2;
        save2String=decoder;
        String se = "";
        StringBuilder sb = new StringBuilder(decoder);
        int count = decoder.length();
        for(int i=0;i<1;i++){
            sb.insert(count, decoder2);
        }
        se = String.valueOf(sb);
        save1 = count;
        return se;
    }

    private static String AddLast1(String decoder, String decoder2) {
        save3String=decoder;
        save2 = decoder.length();
        String dd = decoder2+decoder;
        return dd;
    }
    private static String RemoveFirst(String decoder) {



        return decoder.substring(save1, decoder.length());

    }

    private static String RemoveLast(String decoder) {


        return  decoder.substring(0, decoder.length() - save2);
    }
    private static void toStringRec() {
        System.out.println(ANSI_GREEN+"•\tдобавление элемента в начало списка AddFirst(): "+ANSI_RED+AddFirst2()+ANSI_GREEN+" Строка добавлена эта ("+ANSI_RED+save2String+ANSI_GREEN+")");

        System.out.println(ANSI_GREEN+"•\tдобавление элемента в конец списка AddLast(): "+ANSI_RED+AddLast2()+ANSI_GREEN+" Строка добавлена эта ("+ANSI_RED+save3String+ANSI_GREEN+")");
    }
    private static String AddFirst2() {

        list.add(0,save1String);
        list.add(1,save2String);
        list.add(2,save3String);
        return list.get(1)+list.get(0);
    }
    private static String AddLast2() {
        return list.get(1)+list.get(0)+list.get(2);
    }
}
