package variablestekrar0;

import java.util.Scanner;

public class C02ornek {
    public static void main(String[] args) {


        // Kullanıcının yazdığı metni, ’hacker’ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili(“java ile hersey guzel”)
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.



        String ornekCumle = "java ile hersey guzel";
        hackerDili(ornekCumle);

    }

    public static void hackerDili(String a) {
      a= a.replaceAll("s","5").replaceAll("a","4").replaceAll("e","3").replaceAll("i","3").replaceAll("o","0");
        System.out.println(a);
            }





}
