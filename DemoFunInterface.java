interface Drawable{  
    public void draw();  
}  


class DemoFunInterface{

 public static void main(String[] args) {

       int d1=21;

      Drawable d =

          ()->{
             
                    System.out.println("Write "+d1);
              
          
       };    

         d.draw();

}

}