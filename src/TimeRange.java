public abstract class TimeRange {
    protected String startDate;
    protected String endDate;
    protected int nextDayCount;

    public TimeRange(String startDate, String endDate, int nextDayCount) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.nextDayCount = nextDayCount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getNextDayCount() {
        return nextDayCount;
    }

    public void setNextDayCount(int nextDayCount) {
        this.nextDayCount = nextDayCount;
    }

    public void display() {
        System.out.println("Start date: " + startDate);
        System.out.println("End date: " + endDate);
        System.out.println("Next day count: " + nextDayCount);
    }
}

class StartAndEndDate extends TimeRange{

    public StartAndEndDate(String startDate, String endDate, int nextDayCount) {
        super(startDate, endDate, nextDayCount);
    }
}

class PreviousDay extends TimeRange{
    public PreviousDay(String startDate, int nextDayCount) {
        super(startDate, null, -nextDayCount);
    }
}

class NextDay extends TimeRange{
    public NextDay(String startDate, int nextDayCount) {
        super(startDate, null, nextDayCount);
    }
}
