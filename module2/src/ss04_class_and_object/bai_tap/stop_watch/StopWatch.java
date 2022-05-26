package ss04_class_and_object.bai_tap.stop_watch;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class StopWatch {
  private LocalDateTime startTime, endTime;

  public StopWatch() {
    //        this.startTime = java.time.LocalDateTime.now();
  }

  public void start() {
    this.startTime = java.time.LocalDateTime.now();
  }

  public void stop() {
    this.endTime = java.time.LocalDateTime.now();
  }

  public LocalDateTime getStartTime() {
    return this.startTime;
  }

  public LocalDateTime getEndTime() {
    return this.endTime;
  }

  public long getMilisecondsOfTime(LocalDateTime time) {
    ZonedDateTime ztd = ZonedDateTime.of(time, ZoneId.systemDefault());
    return ztd.toInstant().toEpochMilli();
  }

  public long getElapsedTime() {
    long miliStartTime = this.getMilisecondsOfTime(this.startTime);
    long miliEndTime = this.getMilisecondsOfTime(this.endTime);

    return miliEndTime - miliStartTime;
  }
}
