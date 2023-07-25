package variablestekrar0;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birden buyuk bir tam sayi giriniz..");
        int number =input.nextInt();

        ArrayList<Integer>fibonacciList=new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        int i=0;
        while (fibonacciList.get(i-1)+fibonacciList.get(i-2)<=number){
            fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i+1));
            i++;

        }
        System.out.println(fibonacciList);

    }


}
