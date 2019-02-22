package inter;

import java.awt.*;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Reference1 {
    public static void main(String[] args) {

        Object o = new Object();
        WeakReference weakReference = new WeakReference(o);
        //SoftReference softReference = new SoftReference(o);

        System.out.println(weakReference.get());
        //System.out.println(softReference.get());
        o = null;


        List<Integer> integers= new ArrayList<>();
        for (int i = 0; i< 47000; i++){
            integers.add(i);

        }
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();
        System.gc();

        System.out.println("After = " + weakReference.get());
        //System.out.println("After" + softReference.get());
    }
}
