package com.example.memorydb.user.service;

import com.example.memorydb.user.db.UserRepository;
import com.example.memorydb.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor  //생성자로부터 주입받겠다 final 객체 UserRepository 주입해줌 (config로부터)
public class UserService {

    private final UserRepository userRepository;
    public UserEntity save(UserEntity user){
        return userRepository.save(user);

    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    //delete
    public void delete(UserEntity id){
        userRepository.delete(id);
    }

    //findById : id가 일치하는게 있으면 리턴
    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public List<UserEntity> filterScore(int score){
        return userRepository.findAllByScoreGreaterThan(score);
    }

}
