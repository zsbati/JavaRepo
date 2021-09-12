public class HexaObserver extends Observer {
    Subject subject;

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update(){
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
