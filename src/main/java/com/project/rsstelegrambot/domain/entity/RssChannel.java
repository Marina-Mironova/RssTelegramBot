package com.project.rsstelegrambot.domain.entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Timer;

@Entity
@Table(name = "RssChannelDataTable")
public class RssChannel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "channelId")
    private long channelId;

    @Column(name = "channelName")
    private String channelName;

    @Column(name = "StatusChannel")
    private boolean isChannelActive;


    @Column(name = "frequency")
    private Timestamp frequencyUpdateChannel;

    public long getChannelId() {
        return channelId;
    }

    public void setChannelId(long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public boolean isChannelActive() {
        return isChannelActive;
    }

    public void setChannelActive(boolean channelActive) {
        isChannelActive = channelActive;
    }

    public Timestamp getFrequencyUpdateChannel() {
        return frequencyUpdateChannel;
    }

    public void setFrequencyUpdateChannel(Timestamp frequencyUpdateChannel) {
        this.frequencyUpdateChannel = frequencyUpdateChannel;
    }
}
