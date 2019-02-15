package com.qa.user.userapi.reciever;

import com.qa.user.userapi.persistence.domain.SentUser;
import com.qa.user.userapi.persistence.repository.MongoUserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class UserReceiver {


    @Autowired
    private MongoUserRepo repo;

    @JmsListener(destination = "UserQueue", containerFactory = "myFactory")
    public void receiveMessage(SentUser sentUser) {
        repo.save(sentUser);
    }
}
