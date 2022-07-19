package com.ms.email.controller;

import com.ms.email.dtos.EmailDto;
import com.ms.email.enums.StatusEmail;
import com.ms.email.models.EmailModel;
import com.ms.email.service.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailModel.setSendDateEmail(LocalDateTime.now());
        emailModel.setStatusEmail(StatusEmail.SENT);
        emailService.sendRmail(emailModel);
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }

}
