package net.zakaria.customerservice.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "global.params")
@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class GlobalConfig {
    private int m;
    private int n;
}
