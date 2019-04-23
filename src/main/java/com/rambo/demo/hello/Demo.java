package com.rambo.demo.hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * User: za-panyong
 * Date: 2018/9/18
 * Time: 18:14
 * @author panyong
 */
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "rambo")
public class Demo {
    private Integer ra;
    private String str;
}
