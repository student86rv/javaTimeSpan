public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes > 60) {
            throw new IllegalArgumentException("Minutes > 60");
        }
        this.hours = hours;
        this.minutes = minutes;
    }
				
    public void add(TimeSpan timeSpan) {
		int timeA = hours * 60 + minutes;
		int timeB = timeSpan.getHours() * 60 + timeSpan.getMinutes();
		this.hours = (timeA + timeB) / 60;
		this.minutes = (timeA + timeB) % 60;
	}       
    
    public void sub(TimeSpan timeSpan) {
		if (hours < timeSpan.getHours()) {
            throw new IllegalArgumentException("Time 2 > time1");
        }
		int timeA = hours * 60 + minutes;
		int timeB = timeSpan.getHours() * 60 + timeSpan.getMinutes();
		this.hours = (timeA - timeB) / 60;
		this.minutes = (timeA - timeB) % 60;
	}

    public void mult(double times) {
		int timeA = hours * 60 + minutes;
		this.hours = (int)(timeA * times) / 60;
		this.minutes = (int)(timeA * times) % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}