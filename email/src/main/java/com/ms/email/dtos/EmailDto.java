package com.ms.email.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
public class EmailDto {

    @NotBlank(message = "O campo ownerRef deve ser preenchido.")
    private String ownerRef;
    @NotBlank(message = "O campo emailFrom deve ser preenchido.")
    @Email(message = "O emailFrom é invalido")
    private String emailFrom;
    @NotBlank(message = "O campo emailTo deve ser preenchido.")
    @Email(message = "O emailTo é invalido")
    private String emailTo;
    @NotBlank(message = "O campo subject deve ser preenchido.")
    private String subject;
    @NotBlank(message = "O campo text deve ser preenchido.")
    private String text;

}
