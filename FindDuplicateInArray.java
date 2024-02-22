// 1) Write a Java program to find duplicate elements in an array?

public class FindDuplicateInArray{

    public static int[] findDuplicate(int aa[]){

             int arr[]=new int[aa.length/2];
             int d=0;

             for(int i=0;i<aa.length;i++){ 
 
               for(int j=i+1;j<aa.length;j++){

                   if(aa[i]==aa[j]) {arr[d]=aa[i]; d++; break;}
                    
                    }               
 
                    }

            return arr;
}
}