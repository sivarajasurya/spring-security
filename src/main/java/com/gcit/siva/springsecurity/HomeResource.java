package com.gcit.siva.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeResource {

//    @Autowired
//   private ShowScreenController showScreenController;

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome<h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1> Welcome User <h1>");
    }


    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin</h1>");
    }
}
