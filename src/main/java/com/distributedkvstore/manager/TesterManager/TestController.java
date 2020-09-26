package com.distributedkvstore.manager.TesterManager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {


    @GetMapping("/manager")
    public ResponseEntity<String> stringResponseEntity(){

        String s = new String("HelloWorld");
        return ResponseEntity.ok(s);
    }
}
