package SravnenieKolekcii_6;
import java.util.*;

public class Main {
    private static long start;
    private static long end;


    public static void main(String[] args) {
        for (int t=0; t<=2;t++) {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            start = System.currentTimeMillis();
            ArrayList<String> languageList
                    = new ArrayList<>(Arrays.asList(
                    "           "));
            HashMap<String, Integer> languageMap
                    = convertArrayListToHashMap(languageList);
            for (Map.Entry<String, Integer> entry :
                    languageMap.entrySet()) {

                System.out.println(entry.getKey() + " "
                        + entry.getValue());
            }
            end = System.currentTimeMillis();


            System.out.println("___________________________________________________________________________");
            System.out.println("|Коллекция  |в начало коллекции |в конец коллекции  |в середину коллекции |");
            System.out.println("|ArrayList  |   " + getRunningTime(arrayList));


            System.out.println("|HashMap    |   " + start + "   |   " + end + "   |          " + (end - start) + "          | ");
            System.out.println("|LinkedList |   " + getRunningTime(linkedList));
            System.out.println("___________________________________________________________________________");
        }
    }

    private static String getRunningTime(List<Integer> list) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        String er = String.valueOf(end - start);


        // вывод в консоль времени выполнения блока кода содержащего операцию


        return start + "   |   " + end + "   |          " + er + "         | ";
    }

    private static HashMap<String, Integer>
    convertArrayListToHashMap(ArrayList<String> arrayList) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String str : arrayList) {

            hashMap.put(str, str.length());
        }


        return hashMap;

    }
}
