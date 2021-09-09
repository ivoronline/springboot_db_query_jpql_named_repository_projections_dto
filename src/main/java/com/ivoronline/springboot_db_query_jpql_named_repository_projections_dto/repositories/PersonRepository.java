package com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.repositories;

import com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Object selectPerson(String name);
}


