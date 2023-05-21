package org.example.less;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Vladislav Osada
 * @date 21.05.2023 13:33
 */
@Configuration
@ComponentScan("org.example.less")
@PropertySource("classpath:character.properties")
public class SpringConfig {

}
