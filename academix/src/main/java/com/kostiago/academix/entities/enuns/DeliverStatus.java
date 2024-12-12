package com.kostiago.academix.entities.enuns;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DeliverStatus {

    PENDING("P", "Pending"),
    CANCELLED("C", "Cancelled"),
    APPROVED("A", "Approved");

    private String code;
    private String description;

    private DeliverStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static DeliverStatus fromCode(String code) {
        for (DeliverStatus status : DeliverStatus.values()) {
            if (status.getCode().equals(code)) {
                return status;
            }
        }
        return null;

    }

}
