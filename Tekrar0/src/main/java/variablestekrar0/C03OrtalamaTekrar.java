package variablestekrar0;

public class C03OrtalamaTekrar {

    public static void main(String[] args) {

        /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;
        Bu sayilarin ortalamasini hesaplayan bir kod yaziniz.

         */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        double toplam= num1 + num2 + num3 + num4 + num5;
        System.out.println(toplam);
        System.out.println("toplam = " + toplam);
        double ortalama = toplam/ 5;
        System.out.println("ortalama = " + ortalama);

        System.out.println((num1 + num2 + num3 + num4 + num5)/5);

    }



}
