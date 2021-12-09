public class Reader1 implements Observer
{
    @Override
    public void update(Message m) {
        System.out.println("Reader1   : " + m.getMessageContent());
    }
}