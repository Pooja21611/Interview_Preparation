public class OSFactoryMain{

    public Os getInstance(String str){
        if(str.equals("Open")){
            return new Android();
        }
        else if(str.equals("Close")){
            return new IOS();
        }
        else{
            return new Windows();
        }
    }
}