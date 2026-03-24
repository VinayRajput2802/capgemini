package org.cg.controller;

import jakarta.servlet.http.HttpSession;
import org.cg.Exception.UserNotFound;
import org.cg.entity.Trainee;
import org.cg.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TraineeController {
    @Autowired
    TraineeService service;

    @GetMapping("/all")
    public ResponseEntity<List<Trainee>> extractAll(HttpSession ses){
        if (ses.getAttribute("name") != null){
            return new ResponseEntity<List<Trainee>>(service.getAll(), HttpStatus.OK);
        }
        throw new UserNotFound("First Login and then Access");
    }
}
