package com.ankesh.cdkCommunityDev.security;

public enum ApplicationUserPermission {
    STUDENT_POST_QUESTION,
    STUDENT_DELETE_QUESTION,
    STUDENT_POST_ANSWER,
    STUDENT_UPDATE_QUESTION,
    STUDENT_ALL_ANSWERS_FOR_A_QUESTION,
    ADMIN_GET_ALL_USERS;

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
