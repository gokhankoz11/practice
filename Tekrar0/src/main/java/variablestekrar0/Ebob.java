package variablestekrar0;

import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hosgeldiniz..");
        System.out.println("Bir islem seciniz..");
        System.out.println("Bir islem seciniz \n" + "1-Ebob \n" + "2-Ekok");

        int secim = input.nextInt();



            switch (secim) {
                case 1:
                    System.out.println("Ebob sectiniz..");
                    ebob();
                    break;
                case 2:
                    System.out.println("Ekok sectiniz..");
                    ekok();
                    break;
                default:
                    System.out.println("Yanlis deger girdiniz..");
            }
        }




    static void ebob() {


        int ebob = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz..");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz..");
        int sayi2 = input.nextInt();
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
    }

    static void ekok() {
        int ekok = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz..");
        int sayi1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz..");
        int sayi2 = input.nextInt();
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ekok = i;
            }
        }
    }
}



