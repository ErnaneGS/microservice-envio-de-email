package com.ms.email.service;

import com.ms.email.models.EmailModel;
import com.ms.email.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;


    public void sendRmail(EmailModel emailModel) {
        emailRepository.save(emailModel);
        System.out.println("Email sucesso -- Data/hora:" + emailModel.getSendDateEmail() + "-- emailId:" + emailModel.getEmailId());
    }

}
