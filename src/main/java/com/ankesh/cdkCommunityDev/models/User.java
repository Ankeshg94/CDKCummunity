package com.ankesh.cdkCommunityDev.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class User {


    private String id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
