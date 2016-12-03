package com.yncraig.spring.service;

import com.yncraig.spring.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by craighu on 12/2/16.
 */
@Service
public class IndexService {
    User user;

    public IndexService() {
        user = new User();
        user.setIntro("Just some guy.");
        user.setName("Yong Ning Hu");
    }

    public User getUser() {
        return this.user;
    }
}
