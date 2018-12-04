package com.pm.historyjki.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pm.historyjki.document.HelloDocument;

@Repository
public interface HelloRepository extends MongoRepository<HelloDocument, String> {
}
