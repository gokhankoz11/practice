package hashMap;

import java.util.*;

public class HashMap001 {
    public static void main(String[] args) {

        HashMap<String, Integer> countryPoulation1 = new HashMap<>();
        countryPoulation1.put("Germany", 80);
        countryPoulation1.put("Türkei", 81);
        countryPoulation1.put("Usa", 450);
        System.out.println(countryPoulation1);

        int germany = countryPoulation1.get("Germany");
        System.out.println(germany);

        countryPoulation1.values();
        Set<Map.Entry<String,Integer>>entries=countryPoulation1.entrySet();

        String s="I like you,like like!";
        s.replace("\\p{Punct}","");
        String words[]=s.split(" ");
        HashMap<String,Integer>occ=new HashMap<>();
        for (String w : words){
            Integer number=occ.get(w);
            if(number==0){
                occ.put(w,1);
            }else {
                occ.replace(w,number);
            }
        }



    }

}
