package com.qa.user.userapi.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.user.userapi.persistence.domain.SentUser;

@Repository
public interface MongoUserRepo extends MongoRepository<SentUser, Long>{
}
