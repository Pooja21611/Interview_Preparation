public class Factory{
    public static void main(String [] args){
        
    OSFactoryMain osf = new OSFactoryMain();
    Os os = osf.getInstance("Open");
    os.spec();

    }
}