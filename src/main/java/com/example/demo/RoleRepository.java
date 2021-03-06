package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public interface RoleRepository extends CrudRepository<Role, Long>{
    Role findByRole (String role);
}
