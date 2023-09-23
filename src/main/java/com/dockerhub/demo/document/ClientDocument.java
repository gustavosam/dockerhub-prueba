package com.dockerhub.demo.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "clients")
public class ClientDocument {

  @Id
  private String id;

  private String name;
}
