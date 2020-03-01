package com.ankesh.cdkCommunityDev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


public class Questions {
    private int qId;
    private String desc;
    private String u_id;
    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }



}
