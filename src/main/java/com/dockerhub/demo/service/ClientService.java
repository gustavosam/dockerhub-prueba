package com.dockerhub.demo.service;

import com.dockerhub.demo.document.ClientDocument;

public interface ClientService {

  ClientDocument saveClient(ClientDocument client);

  ClientDocument getClient(String documentClient);
}
