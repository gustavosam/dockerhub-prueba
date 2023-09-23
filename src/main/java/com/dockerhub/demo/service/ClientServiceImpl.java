package com.dockerhub.demo.service;

import com.dockerhub.demo.document.ClientDocument;
import com.dockerhub.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

  @Autowired
  private ClientRepository clientRepository;


  @Override
  public ClientDocument saveClient(ClientDocument client) {
    return clientRepository.save(client);
  }

  @Override
  public ClientDocument getClient(String documentClient) {
    return clientRepository.findById(documentClient).orElse(new ClientDocument());
  }
}
