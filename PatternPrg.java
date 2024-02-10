class PatternPrg{
  public static void main(String args[]){

    int l=5;
      
    for(int i=l;i>0;i--){

      for(int j=1;j<=l;j++){
 
         if(i!=j){System.out.print(j);}else

              System.out.print("*");
           }  
 System.out.println(); 
           }
      }}