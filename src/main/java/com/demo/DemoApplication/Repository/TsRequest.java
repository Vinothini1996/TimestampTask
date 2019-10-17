package com.demo.DemoApplication.Repository;

public class TsRequest {

    Long timeStamp;
    Long newtimeStamp;
    String operation;

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getNewtimeStamp() {
        return newtimeStamp;
    }

    public void setNewtimeStamp(Long newtimeStamp) {
        this.newtimeStamp = newtimeStamp;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
