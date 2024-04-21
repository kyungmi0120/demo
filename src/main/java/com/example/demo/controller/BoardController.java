package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    private String save(){
        return "save";
    }

    @PostMapping("/save")
    private String save(BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        return "index";
    }

    @GetMapping("/user")
    private String selectAll(){
        List<UserDTO> user = boardService.selectAll();

        for(UserDTO userDTO : user){
            System.out.println("DB에 저장되어 있는 값 : " + userDTO);
        }
        return "user";
    }
}
