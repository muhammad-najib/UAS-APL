public class Reader2 implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("Reader2   : " + m.getMessageContent());
    }
}
