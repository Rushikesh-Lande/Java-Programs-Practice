//Write a Java program to find a missing number in an integer array?

class MissingNoArray{

   public static int mNo(int n, int[] aa){ // {9,3,2,1,5,6,8,4}

        int c=1;

       for(int i=0;i<aa.length;i++){
              int d=c; //1

            for(int j=0;j<aa.length;j++){

              if(aa[j]==c) c++;

                       }
               if(c>d) continue;
               else if(c==d) break; 
 
            }
          return c;       
  }
}