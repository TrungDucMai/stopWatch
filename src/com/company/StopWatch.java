package com.company;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public LocalTime Start() {
        return this.startTime = LocalTime.now();
    }

    public LocalTime End() {
        return this.endTime = LocalTime.now();
    }
    public int getElapsedTime(){
        return ((endTime.getHour() - startTime.getHour())*3600 + (endTime.getMinute() -startTime.getMinute())*60 +(endTime.getSecond()-startTime.getSecond()))*1000;
    }
}
