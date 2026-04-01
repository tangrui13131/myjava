package CN;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class denm2
{   static Random rand = new Random();
    static  Scanner sc = new Scanner(System.in);
    static int f(int n,int m){
        return rand.nextInt(m-n+1)+n;

    }
    static int x1(){
        return  sc.nextInt();
    }
    static boolean check(int n,int m){
        if(n>m){
            System.out.println("小了");
            return false;

        }
        if(n<m){
            System.out.println("大了");
            return false;
        }
        else{
            return true;
        }









    }
    public static void main(String[] args) {
        int x=f(50,80);
        System.out.println("随机数是"+x);
        for(;;){
            int y=x1();
            if(check(x,y)){
                System.out.println("YES")
                ;
            }


        }

    }


}
