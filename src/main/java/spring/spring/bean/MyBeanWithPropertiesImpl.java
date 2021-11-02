package spring.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@NoArgsConstructor
@Data

public class MyBeanWithPropertiesImpl implements MyBeanWithProperties{


    private String name;
    private String apellido;

    public MyBeanWithPropertiesImpl(String name, String apellido){
        this.name=name;
        this.apellido=apellido;
    }
    @Override
    public String function() {
        return name+" "+apellido;
    }
}
