package com.ms.email.repository;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
