package variablestekrar0;

public class C06MethodCreationtekrar {
    public static void main(String[] args) {
    double kareAlan =  kare(2,4);
        System.out.println(kareAlan);


        ucgen(2,4,2);


    }
    public static double kare (double a, double b){
        return a*a+b*b;
    }
    public static void ucgen (double a, double b, double c) {

    double sonuc=a*b+c;
        System.out.println(sonuc);
    }
}
