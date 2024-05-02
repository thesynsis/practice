package com.synsis.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.synsis")
@PropertySource("jdbc.properties")
public class SpringConfig {
}
