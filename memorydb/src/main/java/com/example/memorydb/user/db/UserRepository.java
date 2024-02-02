package com.example.memorydb.user.db;

import com.example.memorydb.db.SimpleDataRepository;
import com.example.memorydb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    //SimpleDataRepository 상속받아 공간 만들어주고 각각의 저장되는 타입은 UserEntity, Id는 Long 타입
    public List<UserEntity> findAllByScoreGreaterThan(int score); // select * from user where score >= [??]
}
