public class OctalObserver extends Observer{
    Subject subject;

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update(){
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
