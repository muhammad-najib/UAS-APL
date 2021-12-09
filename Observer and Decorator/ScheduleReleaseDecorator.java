public class ScheduleReleaseDecorator extends ScheduleDecorator{
    public ScheduleReleaseDecorator (Schedule decoratorRelease){
        super(decoratorRelease);
    }

    @Override 
    public void addSchedule(){
        decoratorRelease.addSchedule();
        setReleaseSchedule(decoratorRelease);
    }

    private void setReleaseSchedule (Schedule decoratorRelease){
        System.out.println("Date    : 9 December 2021\n");
    }
}