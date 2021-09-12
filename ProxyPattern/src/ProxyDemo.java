public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        //image will be loaded from the disk
        image.display();
        System.out.println("");
        //will not be loaded from the disk, it already is
        image.display();
    }

}
