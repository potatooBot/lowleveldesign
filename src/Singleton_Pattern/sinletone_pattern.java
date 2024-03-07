package Singleton_Pattern;
class Singleton{
    private static Singleton instance;
   private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
public class sinletone_pattern {
    public static void main(String[] args) {
        Singleton singleInstace1=Singleton.getInstance();
        Singleton singleInstace2=Singleton.getInstance();
    if(singleInstace1==singleInstace2){
        System.out.println("True");
    }
    else {
        System.out.println(false);
    }
    }

}
