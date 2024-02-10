import java.util.*;
//import java.util.LinkedList;
class collection02{
public static void main(String args[]){
   LinkedList<Integer> list=new LinkedList<>();
   list.add(53);
   list.add(52);
   list.add(81);
   list.add(58);

     /*   System.out.println(list);  
        list.clear();  
        System.out.println(list);  */
  
    Iterator itr=list.iterator();
    while(itr.hasNext())
       {
         System.out.println(itr.next);
       }
}
}