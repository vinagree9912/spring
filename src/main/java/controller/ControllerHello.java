package controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ControllerHello {


    @GetMapping("/hello")
    public ResponseEntity<String> hola(){

        String helloSpring="Hello by nicolas "+new Date();
        return new ResponseEntity<String>(helloSpring,new HttpHeaders(), HttpStatus.OK);
    }
}
