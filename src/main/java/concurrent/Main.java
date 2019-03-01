package concurrent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        List l = new CopyOnWriteArrayList();


        Semaphore semaphore = new Semaphore(7);
    }

}
