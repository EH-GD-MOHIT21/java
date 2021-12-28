import java.lang.*;
import java.util.*;

class MyThread implements Runnable{
    int value;
    MyThread(int val){
        value = val;
    }
    
    public void run(){
        if(value==1){ 
            for(var i=0;i<=100;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        else if(value==2){
            for(var i=0;i<=100;i++){
                if(i%2==1){
                    System.out.println(i);
                }
            }
        }
        else{
            for(var i=0;i<=50;i++){
                if(i%3==0){
                    System.out.println(i);
                }
            }
        }
    }
}

public class MyThread_implementing_runnable_interface{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        Runnable runnable = new MyThread(val);
        Thread thread = new Thread(runnable);   
        thread.start();
    }

}
