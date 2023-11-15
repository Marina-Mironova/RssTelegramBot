package com.project.rsstelegrambot.service;

import com.project.rsstelegrambot.domain.entity.RssChannel;
import com.project.rsstelegrambot.domain.entity.User;

import java.util.List;

public class RssChannelService {


        private RssChannelRepository repository;

        public RssChannelService(RssChannelRepository repository) {
            this.repository = repository;
        }

        public List<User> getAll() {
            return repository.findAll();
        }


}
