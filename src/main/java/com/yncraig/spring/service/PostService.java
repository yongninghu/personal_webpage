package com.yncraig.spring.service;

/**
 * Created by craighu on 12/3/16.
 */
import com.yncraig.spring.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private MongoOperations mo;

    //I am and will be the only User of this db.
    public List<Post> getPost(String name, String type) {
        Criteria newCriteria = Criteria.where("owner").is(name);
        if(!type.equals("all")) {
            newCriteria.andOperator(Criteria.where("type").is(type));
        }
        Query searchUserQuery = new Query(Criteria.where("owner").is(name));

        List<Post> savedPosts = mo.find(searchUserQuery, Post.class);
        return savedPosts;
    }
}
