//  Write a Java program to count occurrences of each element in an array?
import java.util.*;
class CountOccurrenceInArray{

    public static void cO(int[] ar){
      int count =0;
     
   Set<Integer> set= new HashSet<>();  
   for(int a:ar){set.add(a);} 
   List<Integer> l=new ArrayList<>(set);

       for(int i=0;i<l.size();i++){
           count=0;
           for(int j=0;j<ar.length;j++){

                 if(l.get(i)==ar[j]) count++;

             }

            System.out.println(l.get(i)+" = "+count);
            
       }

 }

}