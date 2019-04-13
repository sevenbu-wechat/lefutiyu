package com.lefutiyu.sevenbu.mp.dto;


/**
 * Created by guoqing on 2019/4/13.
 */
public class TrainAddressScheduleDTO {
    private Integer id;
    private String address;
    private String timeSchedule;

    private String trainBaseCode;
    private Integer timeScheduleCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTrainBaseCode() {
        return trainBaseCode;
    }

    public void setTrainBaseCode(String trainBaseCode) {
        this.trainBaseCode = trainBaseCode;
    }

    public String getTimeSchedule() {
        return timeSchedule;
    }

    public void setTimeSchedule(String timeSchedule) {
        this.timeSchedule = timeSchedule;
    }

    public Integer getTimeScheduleCode() {
        return timeScheduleCode;
    }

    public void setTimeScheduleCode(Integer timeScheduleCode) {
        this.timeScheduleCode = timeScheduleCode;
    }
}
