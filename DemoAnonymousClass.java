interface AnonymousClass{

      String say(String a);
}

class DemoAnonymousClass{

     public static void main(String args[]){

      AnonymousClass an=new AnonymousClass(){
           public String say(String a){
               return a;}
                     };

      String s=an.say("Hello I'M Anonymous Class");

    System.out.println(s);
}
}