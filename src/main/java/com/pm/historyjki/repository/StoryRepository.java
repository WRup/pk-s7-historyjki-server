package com.pm.historyjki.repository;

import com.pm.historyjki.model.Story;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoryRepository extends MongoRepository<Story,String> {
}
