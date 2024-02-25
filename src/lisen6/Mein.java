package lisen6;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Mein {
    private static final int DA = 0;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {

        final String decoder = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            HashMap<Integer, String> HashMap = new HashMap<>();
            Random random = new Random();

            for (int count = 0; count < 10; count++) {
                int key = random.nextInt(10 - 1 + 1) + 1;
                HashMap.put(key, getRandomString(key, decoder));
            }

            getKeyMoreFive(HashMap);
            printStringMod3(HashMap);




    }
    private static String getRandomString(int size, String decoder) {
        Random random = new Random();
        return IntStream.rangeClosed(1, size).
                mapToObj(i -> String.valueOf(decoder.charAt(random.nextInt(decoder.length())))).
                reduce( " ", (x, y) -> x + y);
    }

    private static void printStringMod3(Map<Integer, String> map) {

        map.entrySet().stream().filter(e -> e.getKey() % 3 == 0).forEach(e -> System.out.print(ANSI_RED+"\n HashMap Key -->"+ "0" +"\n HashMap string -->"+e.getValue() + ANSI_PURPLE +","));

    }

    private static String getKeyMoreFive(Map<Integer, String> map) {


        map.entrySet().stream().filter(e -> e.getKey() > 5).forEach(e -> System.out.print(ANSI_GREEN+"\n > 5  "+"HashMap Key -->"+ e.getKey() +"\n HashMap string -->"+e.getValue() + " " ));


        return null;
    }
}
