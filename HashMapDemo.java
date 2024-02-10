import java.util.*;
class HashMapDemo{

     public static void main(String args[]){

     Map<Integer,String> set=new HashMap<>();

     set.put(11,"hi");
     set.put(12,"hey");
     set.put(13,"hello");
     set.put(14,"hellow");
     set.put(14,"hiiii");

     set.remove(14);

     System.out.println(set.get(13));

     Set<Integer> map=set.keySet();

     for(Integer a:map){ System.out.println(a+" "+set.get(a));};
}
}