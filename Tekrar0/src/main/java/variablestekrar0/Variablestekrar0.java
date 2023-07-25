package variablestekrar0;

public class Variablestekrar0 {


    public static void main(String[] args) {

String ulkeIsmi = "Turkey" ;
        System.out.println (ulkeIsmi) ;

       int sonuc = toplamaYap (3, 5 );
        System.out.println(sonuc);

      long carpmaSonucu = multiply (5 , 12) ;
        System.out.println(carpmaSonucu);

        long ilkOrnek = sonucBulma (5,4,2);
        System.out.println(ilkOrnek);

        double sonOran = virgulluSayi(2.5, 2) ;
        System.out.println(sonOran);
        int hassasOran = agirlikSystem(6,3, 2) ;
        System.out.println(hassasOran);

    }

    public static int toplamaYap (int a, int b ) {
        return  a+b;

        }
    public static long multiply (int a , int b) {
        return a*b ;
    }

    public static long sonucBulma (int x, int y , int z ) {

        return x*y+z ;
    }
    protected static double virgulluSayi (double a , double b) {
        return a*b ;
    }

    public static int agirlikSystem (int a, int b ,int c) {
        return a*b/c ;
    }

}
