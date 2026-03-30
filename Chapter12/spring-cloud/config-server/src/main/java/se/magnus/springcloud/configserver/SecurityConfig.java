package se.magnus.springcloud.configserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain configure(HttpSecurity http) throws Exception {
    // Disable CSRF protection only for /encrypt and /decrypt endpoints to allow POST,
    // while keeping CSRF protection enabled for all other requests.
    http.csrf(csrf -> csrf.ignoringRequestMatchers("/encrypt", "/decrypt"))
        .authorizeHttpRequests(requests -> requests.anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults());
    return http.build();
  }
}
