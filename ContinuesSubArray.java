//Write a Java program to find continuous sub array whose sum is equal to a given number?

class ContinuesSubArray{

      public static int[] cSa(int[] aa,int n){

         int count=0;
         int l=0;
         int l2=0;
         int l3=0;
         int l4=0;

           for(int i=0;i<aa.length;i++){
            
              for(int j=i;j<aa.length;j++){

               count=aa[j]+count;

               if(count==n){ l=i;l2=j;break;}

       }

    }

      for(int k=l;k<=l2;k++){l3++;}
      int[] arr=new int[l3];
     
      for(int m=l;m<=l2;m++){
             
             arr[l4]=aa[m];
             l4++;
        }
     return arr;
}
}