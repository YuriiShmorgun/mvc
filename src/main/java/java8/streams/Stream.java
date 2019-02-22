package java8.streams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class Stream {


    public static void main(String[] args) {



        List list = new LinkedList();

        list.add(1);
        list.add(4);
        list.add(10);
        list.add(-3);
        list.add(6);
        list.add(5);
        list.add(9);


        Spliterator spliterator;

        List list1 = new ArrayList();

        list.stream().sorted().forEach(s->System.out.println(s));










    }
}
