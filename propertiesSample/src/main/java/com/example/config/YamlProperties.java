package com.example.config;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;
import lombok.Data;

@Repository
@Configuration
@ConfigurationProperties(prefix = "yaml")
@PropertySource(value = "classpath:foo.yml", factory = YamlPropertiesSourceFactory.class)
@Data
public class YamlProperties {

  private String name;
  private String sample;

  private List<String> aliases;

}
