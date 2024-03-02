package lisen7;

import java.util.*;

public class Mein {
    private static long start;
    private static long end;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001b[31;1m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {

        System.out.println("\n Сколько будет N человек ");
        Scanner scanner4 = new Scanner(System.in);
        int n = Integer.parseInt(scanner4.nextLine());


        start = System.currentTimeMillis();
        List<Integer> arrayList  = new ArrayList<>();
        arrayList(n, arrayList );
        System.out.println(arrayList );
        josephModel(arrayList );
        end = System.currentTimeMillis();
        long Se = end-start;
        System.out.print(ANSI_GREEN+"ArrayList Время выполненяи -->"+Se+"мс\n"+ ANSI_PURPLE);


        start = System.currentTimeMillis();
        List<Integer> linkedList   = new LinkedList<>();
        arrayList(n, linkedList  );
        System.out.println(linkedList  );
        josephModel(linkedList  );
        long Se1 = end-start;
        end = System.currentTimeMillis();
        System.out.print(ANSI_GREEN+"LinkedList Время выполненяи -->"+Se1+"мс\n");
        System.out.print(ANSI_RED+"LinkedList и ArrayList - это две разные реализации интерфейса List. LinkedList реализует это с помощью двусвязного списка. ArrayList реализует это с помощью массива динамического изменения размера.");
    }

    public static void arrayList(int n, List<Integer>  arrayList ) {
        for(int i = 0; i < n; i++) {
            arrayList.add(i + 1);
        }
    }



    public static void josephModel(List<Integer>  arrayList ) {
        int count = 0;
        Iterator<Integer> it = arrayList .iterator();
        while(arrayList .size() > 1) {
            if(it.hasNext()) {
                it.next();
                count++;
                if(count == 2) {
                    it.remove();
                    count = 0;
                    System.out.println(arrayList );
                }
            }
            else {
                it = arrayList .iterator();
            }
        }
    }
}
