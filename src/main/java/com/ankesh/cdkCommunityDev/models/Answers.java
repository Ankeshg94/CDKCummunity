package com.ankesh.cdkCommunityDev.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class Answers {

    private String aId;
    private String desc;
    private String userId;
    private int qId;

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }
}
