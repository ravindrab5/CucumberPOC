package com.autodesk.cucumberautomation.others;

import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

  public static void main(String args[]) throws InterruptedException {
        MyRunnable runnable=new MyRunnable();

        Thread thread1=new Thread(runnable);
        Thread thread2=new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        Process p;
  }

}
