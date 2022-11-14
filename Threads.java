import java.lang.Thread ;



  class CustomThread extends  Thread {
    public  CustomThread(){
        System.out.println(" I will be create Thread");
    }
    public  void run(){
        System.out.println("I will be pave away thread ");
    }
}
 class  client {
       public  void Clien_methode(){

           CustomThread Th_obj1=new CustomThread();
           Th_obj1.run();
           Th_obj1.start();

       }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("Thread is a small piece of programm");
        CustomThread obj=new CustomThread();
        obj.run();
        client objc=new client();
        objc.Clien_methode();
    }

}