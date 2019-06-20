package counttime;

public class StopTime {
    private long startTime, endTime;

    public StopTime(){
    }

    public long getStartTime() {
        return startTime= System.currentTimeMillis();
    }
    public long getEndTime() {
        return endTime= System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return startTime-endTime;
    }
}

