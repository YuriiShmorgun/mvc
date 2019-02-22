package java8.streams.predicates;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> nums = new ArrayList<>();

        nums.add(new Person("Sergy", 38));
        nums.add(new Person("Igor", 25));
        nums.add(new Person("Dima", 15));
        nums.add(new Person("Lida", 17));
        nums.add(new Person("Zoya", 16));

        for (Person person:nums){
            System.out.println(person);
        }


        //nums.stream().forEach();

    }
}
