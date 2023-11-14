package com.project.rsstelegrambot.domain.entity;
import jakarta.persistence.*;


import java.sql.Timestamp;


@Entity
@Table(name = "userDataTable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "chatId")
    private Long chatId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "registeredAt")
    private Timestamp registeredAt;

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Timestamp getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Timestamp registeredAt) {
        this.registeredAt = registeredAt;
    }



    @Override
    public String toString() {
        return "User{" +
                "chatId=" + chatId +
                ", userName='" + userName + '\'' +
                ", registeredAt=" + registeredAt +
                '}';
    }
}

