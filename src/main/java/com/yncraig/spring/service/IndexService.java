package com.yncraig.spring.service;


import com.yncraig.spring.config.AppConfig;
import com.yncraig.spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * Created by craighu on 12/2/16.
 */
@Service
public class IndexService {

    @Autowired
    private MongoOperations mo;

    //I am the only User of this db.
    public User getUser(String name) {
        Query searchUserQuery = new Query(Criteria.where("name").is(name));

        User savedUser = mo.findOne(searchUserQuery, User.class);
        return savedUser == null ? new User(): savedUser;
    }
}
