public class SingletoClass{

   private static SingletoClass sing=null;

   private SingletoClass(){}

   public static SingletoClass getSing(){
           if(sing==null){
                 sing= new SingletoClass();}
                   
              return sing;
          
}
public int add(int a,int b){return a+b;}
}