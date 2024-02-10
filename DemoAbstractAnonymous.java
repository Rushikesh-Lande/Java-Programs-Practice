abstract class AnonymousExpl<T>{

     abstract void msg(T sms);
}

class DemoAbstractAnonymous extends AnonymousExpl<String>{

 public void msg(String sms){
                System.out.println(sms);
              }  

 public static void main(String args[]){

           
    DemoAbstractAnonymous aa=new DemoAbstractAnonymous();
        aa.msg("Hello I'M Abstarct Anonymous Class");
} 
}