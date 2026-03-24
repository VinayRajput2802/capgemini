package org.cg.service;

import org.cg.entity.Trainee;
import org.cg.repo.ITraineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeService {
    @Autowired
    ITraineeRepo repo;

    public List<Trainee> getAll(){
        return repo.findAll();
    }

}
