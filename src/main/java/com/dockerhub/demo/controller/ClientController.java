package com.dockerhub.demo.controller;

import com.dockerhub.demo.document.ClientDocument;
import com.dockerhub.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ClientController {

  @Autowired
  private ClientService clientService;


  @PostMapping("/client")
  public ResponseEntity<?> saveClient(@RequestBody ClientDocument clientDocument){
    return ResponseEntity.status(HttpStatus.CREATED).body(clientService.saveClient(clientDocument));
  }

  @GetMapping("/client/{id}")
  public ResponseEntity<?> getClient(@PathVariable("id") String id){
    return ResponseEntity.ok(clientService.getClient(id));
  }
}
