class FibonacciSeries{
  public static void main(String args[]){

       int f=19;
       int fb=1;
       int nev=0;
       int pev=0;
       
     System.out.print(0+" "+1+" ");

      for(int i=1;i<=f;i++){

               nev=fb+pev;
                if(nev>f) break; 
              System.out.print(nev+" ");
                 pev=fb;
                 fb=nev;  
                  
            }
     
}
}