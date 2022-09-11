package com.autodesk.cucumberautomation.others;

public class MyRunnable implements Runnable{
    ThreadLocal<Vehicle> threadLocal=new ThreadLocal<>();
  @Override
  public void run() {
    threadLocal.set(new Vehicle("LMV",String.valueOf((int) (Math.random() * 100D)),"Maruti Ertiga"));

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }

    System.out.println(threadLocal.get());
  }
}
