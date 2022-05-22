package ss04_class_and_object.bai_tap.StopWatch;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        StopWatch myStopWatch = new StopWatch();
        myStopWatch.start();
        System.out.println("start: "+myStopWatch.getStartTime());
        Thread.sleep(5000);
        // sleep 5s
        myStopWatch.stop();
        System.out.println("stop: "+myStopWatch.getEndTime());
        System.out.println("duration: "+myStopWatch.getElapsedTime());
    }
}
