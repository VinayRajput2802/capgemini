package org.cg.service;

import org.cg.Exception.UserNotFound;
import org.cg.entity.Login;
import org.cg.repo.ILoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private ILoginRepo repo;

    public Login validateUser(Login user){
        Optional<Login> op = repo.findById(user.getUserName());
        if (op.isPresent()){
            if (op.get().getPassword().equals(user.getPassword())){
                return op.get();
            }
        }
        throw new UserNotFound("Invalid User!");
    }
}
