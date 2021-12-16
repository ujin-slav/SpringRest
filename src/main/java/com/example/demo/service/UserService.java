package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.UserEntity;
import com.example.demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Page<UserEntity> getUser(int limit){
        Pageable lim = PageRequest.of(0,limit);
        Page<UserEntity> user = userRepo.findAll(lim);
        return user;
    }
}
