package com.lefutiyu.sevenbu.mp.dto;

/**
 * Created by guoqing on 2019/3/20.
 */
public class SignUpUserDTO {
    private Integer id;
    private String userName;
    private String trainBase;
    /** 1:周一，2：周二...*/
    private String weekDay;
    //时间段：16:30-18:00
    private String timeSchedule;
    private int age;
    private int height;
    private String mobile;
    private String channel;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTrainBase() {
        return trainBase;
    }

    public void setTrainBase(String trainBase) {
        this.trainBase = trainBase;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getTimeSchedule() {
        return timeSchedule;
    }

    public void setTimeSchedule(String timeSchedule) {
        this.timeSchedule = timeSchedule;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
