package com.autodesk.cucumberautomation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.autodesk.cucumberautomation.*" })
public class ConfigurationClass {
}
