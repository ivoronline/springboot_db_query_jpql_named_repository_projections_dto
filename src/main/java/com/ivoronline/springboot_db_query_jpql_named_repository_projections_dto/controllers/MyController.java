package com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.DTO.PersonDTO;
import com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;    //Only for INSERT

  //================================================================
  // SELECT PERSON
  //================================================================
  @RequestMapping("SelectPerson")
  PersonDTO selectPerson() throws JsonProcessingException {

    //GET COLUMNS
    Object[] columns = (Object[]) personRepository.selectPerson("John");

    //DISPLAY COLUMNS
    String columnsJSON = new ObjectMapper().writeValueAsString(columns);
    System.out.println(columnsJSON);  //["John",20]

    //MAP COLUMNS INTO DTO
    PersonDTO personDTO = new PersonDTO();
              personDTO.name = (String ) columns[0];
              personDTO.age  = (Integer) columns[1];

    //RETURN DTO
    return personDTO;
  }

}


