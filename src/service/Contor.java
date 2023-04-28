package service;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Contor {
   private static AtomicInteger atomic = new AtomicInteger(0);

   public void Increment(){
       synchronized (Contor.class){
           atomic.incrementAndGet();
           System.out.println("Value " + atomic);
       }
   }
}
