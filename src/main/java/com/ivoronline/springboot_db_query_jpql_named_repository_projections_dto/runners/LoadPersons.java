package com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.runners;

import com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.entities.Person;
import com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  @Autowired PersonRepository personRepository;

  //=======================================================================================
  // RUN
  //=======================================================================================
  @Override
  @Transactional
  public void run(String... args) throws Exception {

    //CREATE PERSON
    Person person       = new Person();
            person.name = "John";
            person.age  = 20;

    //SAVE PERSON
    personRepository.save(person);

  }

}
