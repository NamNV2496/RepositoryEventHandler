package com.example.repositoryeventhandler.controller;

import com.example.repositoryeventhandler.domain.Role;
import com.example.repositoryeventhandler.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ExampleController {
    private final RoleRepository roleRepository;

    @GetMapping("/test")
    public String test(String name) {
        Role role = Role.builder().id(1L).name(name).build();
        roleRepository.save(role);
        return "Ok";
    }
}
