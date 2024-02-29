//Write a Java program to remove duplicate elements from an array?

class RemoveArrayDuplicates{

      public static int[] rD(int[] arr){

         int[] ar=new int[arr.length-1];
         int x=0,y=0,z=0,c=1;

           for(int i=0;i<arr.length;i++){
                   x=0;
                 for(int j=0;j<ar.length;j++){
                  
                   if(arr[i]!=ar[j]) x++;
                  else if(arr[i]==ar[j]) {x=0; break;}
                
               }

                  if(x>0) {ar[y]=arr[i];y++;}
               else if(x==0) continue;

           }
       while(ar[z]!=0){c++;z++;}

        int[] result = new int[c];
         z=0;

        do{
             result[z]=ar[z];
             z++;   

             }while(ar[z]!=0);

        return result;

 }
}