package lab3.problem_5;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public int compareTo(Time o) {
        if (this.hour > o.hour) {
            return 1;
        }
        if (this.hour < o.hour) {
            return -1;
        }
        if (this.minute > o.minute) {
            return 1;

        }
        if (this.minute < o.minute) {
            return -1;
        }
        if (this.second > o.second) {
            return 1;
        }
        if (this.second < o.second) {
            return -1;
        }
        return 0;

    }
}
