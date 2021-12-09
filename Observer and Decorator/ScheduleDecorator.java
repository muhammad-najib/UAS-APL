public abstract class ScheduleDecorator implements Schedule{
    protected Schedule decoratorRelease;

    public ScheduleDecorator(Schedule decoratorRelease){
        this.decoratorRelease = decoratorRelease;
    }

    public void color(){
        decoratorRelease.addSchedule();
    }
}
