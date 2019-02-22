package inter;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Referance extends Thread {
   public void run() {

       Object str = new Object(); //Strong reference
       Object str1 = new Object(); //Strong reference

       WeakReference weakReference = new WeakReference(str1); //Weak reference for cash
       SoftReference softReference = new SoftReference(str1); // Soft reference for metadata
       ReferenceQueue referenceQueue = new ReferenceQueue();
       PhantomReference phantomReference = new PhantomReference(str, referenceQueue);

       System.out.println(str);
       str = null;
       str1 =null;
       System.out.println(str);




       new Thread() {
           @Override
           public void run() {
               try {
                   referenceQueue.remove();
                   System.out.println("Yes");
                   System.out.println(weakReference.get());
                   System.out.println(softReference.get());
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }.start();


       while (true){
           System.gc();
       }

   }

}


