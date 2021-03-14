package com.dsm.kkoribyeol.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
class EncoderConfiguration {

    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder()
}