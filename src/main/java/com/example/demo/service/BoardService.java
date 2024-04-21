package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<UserDTO> selectAll(){
        return boardRepository.selectAll();
    }
}
