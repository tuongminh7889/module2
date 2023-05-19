package ss4.bai_tap;


import java.time.LocalTime;
import java.util.Scanner;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }

    public double getElapsedTime() {
        return ((endTime.getHour() * 36 * 10 ^ 5) + (endTime.getMinute() * 6 * 10 ^ 4) + (endTime.getSecond() * 10 ^ 3))
                - ((startTime.getHour() * 36 * 10 ^ 5) + (startTime.getMinute()) * 6 * 10 ^ 4) + (startTime.getSecond() * 10 ^ 3);
    }

}

class BuildStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("press 1 to start");
        int start = Integer.parseInt(scanner1.nextLine());
        if (start == 1) {
            stopWatch.start();
            System.out.println(stopWatch.getStartTime());
        }
        System.out.println("press 0 to stop");
        int stop = Integer.parseInt(scanner1.nextLine());
        if (stop == 1) {
            stopWatch.stop();
            System.out.println(stopWatch.getEndTime());
        }
        System.out.println("time is run" + stopWatch.getElapsedTime() + "millisecond");
    }
}


