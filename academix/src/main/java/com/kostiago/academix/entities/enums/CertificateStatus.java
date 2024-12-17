package com.kostiago.academix.entities.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CertificateStatus {

    PENDING("P", "Pendente"),
    CANCELLED("C", "Cancelado"),
    IN_INSSUE("II", "Em emissão"),
    INSSUED("I", "Emitido"),
    RECTIFIED("R", "Retificado"),
    APPROVED("A", "Aprovado");

    private String code;
    private String description;

    private CertificateStatus(String code, String description) {
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
