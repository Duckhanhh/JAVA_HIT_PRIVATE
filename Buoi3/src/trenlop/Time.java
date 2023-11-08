package trenlop;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void nextSecond() {
        if (this.second < 59) {
            this.second += 1;
        } else if (this.minute < 59) {
            this.second = 0;
            this.minute += 1;
        } else {
            this.second = 0;
            this.minute = 0;
            this.hour += 1;
        }
    }

    public void previousSecond() {
        if (this.second > 0) {
            this.second -= 1;
        } else if (this.minute > 0) {
            this.second = 59;
            this.minute -= 1;
        } else {
            this.hour -= 1;
            this.minute = 59;
            this.second = 59;
        }
    }

    public void display() {
        System.out.print(hour);
        System.out.print(':');
        System.out.print(minute);
        System.out.print(':');
        System.out.print(second);
    }
}
