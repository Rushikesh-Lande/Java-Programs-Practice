//Write a Java program to separate zeros from non-zeros in an integer array?
import java.util.*;
class SeparateZero{

   public static List<Integer> sZero(int[] arr){

      List<Integer> list=new ArrayList<>();
     
       for(int i=0;i<arr.length;i++){

              if(arr[i]!=0) list.add(arr[i]);
              
           }
       for(int j=0;j<arr.length;j++){

           if(arr[j]==0) list.add(arr[j]);
   }
       return list;
 }

}