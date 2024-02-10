class NestedTry{
        public static void main(String args[]){
         float arr[]={25.5f,26.5f,28.6f,0.0f};

       try
            {
              System.out.println(10/1);
          try
               {
             System.out.println("Im Ssecond try block");
              System.out.println(arr[3]);
              System.out.println(arr[2]);
               }
          catch(ArrayIndexOutOfBoundsException a)
               { 
                System.out.println("ArrayIndexOutOfBound Exception");
               }
           
             
          }
          catch(ArithmeticException e)
              {
              System.out.println("Arthmatic Exception");
              }
}
}