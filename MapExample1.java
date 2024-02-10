import java.util.*;
public class MapExample1{
 public static void main(String... args){
       
      Map<Integer,String> map=new HashMap<>();

    map.put(1,"Naveen");

    map.put(2,"Amar");

    map.put(3,"Ajay");

    map.put(4,"Arun");


   for(Integer a:map.keySet()){

         System.out.println(map.get(a));
             }    

         System.out.println( map.entrySet().stream());

}
}