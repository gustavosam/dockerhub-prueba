package com.dockerhub.demo.repository;

import com.dockerhub.demo.document.ClientDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<ClientDocument, String> {
}
