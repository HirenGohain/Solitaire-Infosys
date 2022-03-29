import java.util.*;

class Ex1 extends Thread{
    public void run(){
        int i= 1;
        while(i<=100){
            System.out.println("Ex1 is running");
            i+=1;
        }
    }
}

class Ex2 extends Thread{
    public void runn(){
        int j= 1;
        while(j<=100){
            System.out.println("Ex2 is running");
            j+=1;
        }
    }
 }


public class Thread {
    public static void main(String[] args) {
        Ex1 ob1 = new Ex1();
        Ex2 ob2 = new Ex2();
        ob1.start();
        ob2.start();

    }
    
}
