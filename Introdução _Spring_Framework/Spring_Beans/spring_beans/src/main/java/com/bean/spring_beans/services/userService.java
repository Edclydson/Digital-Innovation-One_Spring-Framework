package com.bean.spring_beans.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.bean.spring_beans.userRepository;

import java.util.ArrayList;

@Service
public class userService {
    
    @Autowired
    private userRepository userRepository;

    public List<String> buscaNome(){
        List<String> nomes = new ArrayList<>();
        System.out.println("Chamou o busca nome!");
        return nomes;
    }

    public void deletaDados(){
        System.out.println("Chamou deleta dados!");
        userRepository.apagadados();
    }
    

}
