package com.example.demo.repository;

import com.example.demo.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import com.example.demo.mapper.UserMapper;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final UserMapper mapper;

    public List<UserDTO> selectAll(){
        return mapper.all();
    }
}
