package com.example.polls.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing

public class AuditingConfig {
    // that's all here for now. We'll add more auditing configurations later.
}
