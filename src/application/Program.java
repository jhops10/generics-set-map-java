package application;


import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {


        List<Integer> myInts = Arrays.asList(5, 2, 3, 10);
        printList(myInts);

        List<String> myStrings = Arrays.asList("Maria", "João", "Paulo", "Paula");
        printList(myStrings);
    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

}
