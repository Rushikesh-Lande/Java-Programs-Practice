 import java.util.*;
class HashMapProg{
  public static void main(String... args){

     Map<Integer,String> map=new HashMap<>(); 

       map.put(1,"Vishal");
       map.put(2,"Uddhav");
       map.put(3,"Amar");
       map.put(4,"Rushi");

     //System.out.println(map.keySet() +" : "+map.values());

    for(String a:map.values()){
              
               System.out.println(a);
            }
     
}
}