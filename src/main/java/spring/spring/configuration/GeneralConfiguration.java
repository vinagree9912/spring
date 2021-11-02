package spring.spring.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.spring.bean.MyBeanWithProperties;
import spring.spring.bean.MyBeanWithPropertiesImpl;


@Configuration
@PropertySource("classpath:connection.properties")
public class GeneralConfiguration {
    @Value("${value.name}")
    private String name;
    @Value("${value.apellido}")
    private String apellido;
    @Value("${value.random}")
    private String random;

    @Value("${jdbc.url}")
    private String jdbcurl;

    @Value("${driver}")
    private String driver;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Bean
    public MyBeanWithProperties function(){
        return new MyBeanWithPropertiesImpl(name,apellido);
    }
}
