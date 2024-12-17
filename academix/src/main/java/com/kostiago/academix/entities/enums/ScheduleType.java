package com.kostiago.academix.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ScheduleType {

    LIVE_CLASS("LV", "Ao vivo"),
    MEENTING("M", "Reunião");

    private String code;
    private String description;

    private ScheduleType(String code, String description) {
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
