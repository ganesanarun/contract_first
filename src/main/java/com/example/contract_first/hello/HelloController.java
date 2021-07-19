package com.example.contract_first.hello;

import com.example.contract_first.api.HelloApi;
import com.example.contract_first.models.Hello;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class HelloController implements HelloApi {

    @Override
    public ResponseEntity<Hello> hello() {
        final var hello = new Hello();
        hello.setText("Let's start");
        return new ResponseEntity<>(hello, OK);
    }
}
