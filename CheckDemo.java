import java.util.*;
class CheckDemo{

     public static void main(String args[]){

     Set<String> set=new HashSet<>();

     set.add("hi");
     set.add("hii");
     set.add("hiii");
     set.add("hiiii");


     set.forEach(s-> System.out.println(s));
}
}