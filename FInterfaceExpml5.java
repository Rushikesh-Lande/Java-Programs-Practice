interface ShowTry{

     void show();
}


public class FInterfaceExpml5{

public static void main(String args[]){


      ShowTry obj=new ShowTry(){

          public void show(){
                System.out.println("In Show Method");
          }
       };

          obj.show();
}

}