package com.project.rsstelegrambot.repository;

import com.project.rsstelegrambot.domain.entity.RssChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RssChannelRepository extends JpaRepository<RssChannel, Long>, CrudRepository<RssChannel, Long> {

}