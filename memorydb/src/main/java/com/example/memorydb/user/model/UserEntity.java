package com.example.memorydb.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
//123

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "user")
public class UserEntity {
    @Id  //primary key 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 방식
    private Long id;


    private String name;

    private int score;

}
