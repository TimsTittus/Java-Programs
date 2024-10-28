import java.lang.*;
import java.util.*;

class Thread1 extends Thread {
    int number;
    Thread1(int number) {
        this.number=number;
    }
    public void run() {
        System.out.println("Random Number: "+number);
    }
}
class Thread2 extends Thread {
    int number;
    Thread2(int number) {
        this.number=number;
    }
    public void run() {
        if(number%2==0) {
            System.out.println("Square of "+number+"="+number*number);
        }
    }
}
class Thread3 extends Thread {
    int number;
    Thread3(int number) {
        this.number=number;
    }
    public void run() {
        if(number%2!=0) {
            System.out.println("Cube of "+number+"="+ number * number * number);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        for(int i=0;i<5;i++){
            int rn=rand.nextInt(100);
            Thread1 t1=new Thread1(rn);
            Thread2 t2=new Thread2(rn);
            Thread3 t3=new Thread3(rn);
            System.out.println("\n");
            t1.start();
            t2.start();
            t3.start();
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Thread Interrupted");
            }
        }
}}
