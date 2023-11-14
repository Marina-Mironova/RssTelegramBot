package com.project.rsstelegrambot.service;

import com.project.rsstelegrambot.domain.entity.User;

import java.util.List;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> getAll() {
        return repository.getAll();
    }
}
