package Proxy_Design_Pattern;
interface Image{
    void display();
}

class RealImage implements  Image{
private String filename;

RealImage(String filename){
    this.filename=filename;
    loadImageFromDisk();
}

public void loadImageFromDisk(){
    System.out.println("Load Image "+filename);
}
    public void display(){
        System.out.println("Displaying Image "+filename);
    }

}
 class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }
    public void display(){
        if(realImage==null){
            realImage=new RealImage(filename);
        }
        realImage.display();
    }
}
public class proxy_design_pattern {
    public static void main(String[] args) {
        Image image=new ProxyImage("Example.jpg");
        image.display();

        image.display();
    }
}
