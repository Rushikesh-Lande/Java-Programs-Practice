import java.util.*;
class ArrayListDemo{
public static void main(String args[]){
     ArrayList al=new ArrayList();
       al.add("A"); 
       al.add("M");  
       al.add(null);  
       al.add("N");
    System.out.println(al); 
       al.remove(1);   
    System.out.println(al); 
       al.add(2,"M");
    System.out.println(al);   
       al.set(3,"P");
    System.out.println(al); 
}
}