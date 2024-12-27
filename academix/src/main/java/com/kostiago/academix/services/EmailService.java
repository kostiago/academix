package com.kostiago.academix.services;

import com.kostiago.academix.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO dto);
}
