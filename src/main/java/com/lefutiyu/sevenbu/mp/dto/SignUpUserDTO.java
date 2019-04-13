package com.lefutiyu.sevenbu.mp.dto;

/**
 * Created by guoqing on 2019/3/20.
 */
public class SignUpUserDTO {
    private Integer id;
    private String userName;
    private int age;
    private int height;
    private String mobile;
    private String channel;
    private String remark;
    private Integer trainBaseScheduleId;

    private String trainBaseCode;
    private Integer timeScheduleCode;

    public String getTrainBaseCode() {
        return trainBaseCode;
    }

    public void setTrainBaseCode(String trainBaseCode) {
        this.trainBaseCode = trainBaseCode;
    }

    public Integer getTimeScheduleCode() {
        return timeScheduleCode;
    }

    public void setTimeScheduleCode(Integer timeScheduleCode) {
        this.timeScheduleCode = timeScheduleCode;
    }

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

    public Integer getTrainBaseScheduleId() {
        return trainBaseScheduleId;
    }

    public void setTrainBaseScheduleId(Integer trainBaseScheduleId) {
        this.trainBaseScheduleId = trainBaseScheduleId;
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
