/* wirte a one interface , one abstract class which will be the sub class of
 interface and one concrete class which will be the sub class of abstract class.
Animal => interface with static and default method. */


interface Animal{

   void makeSound();
  public static void run(){
              System.out.println("Animal is running");
            }

   default int dMethod(int a,int b){
           return a+b;
          }

}


abstract class PetAnimals implements Animal{

        public abstract void eat();
 
        public void makeSound(){

          System.out.println("Pet Animals make low sound");

           }

       }

class DogD extends PetAnimals{



     public void eat(){
                System.out.println("Dog is eating");
            }

           public static void main(String args[]){

           DogD d=new DogD();
                d.eat();
               Animal.run();               
               System.out.println(d.dMethod(3,5));
               d.makeSound();
     
         System.out.println("Dog is a pet animal");
       
                  }

            }