// Write a Java program to find the intersection of two arrays?
import java.util.*;
class TwoArrayItersection{

   public static Set<Integer> m1(int[] arr1,int[] arr2){

       Set<Integer> set=new HashSet<>();
         for(int i=0;i<arr1.length;i++){

              for(int j=0;j<arr2.length;j++){
                 
                    if(arr1[i]==arr2[j]) set.add(arr2[j]);

                    }
             }

        return set;
}
}