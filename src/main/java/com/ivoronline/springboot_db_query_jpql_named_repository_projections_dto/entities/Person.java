package com.ivoronline.springboot_db_query_jpql_named_repository_projections_dto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@NamedQuery(
  name  = "Person.selectPerson",
  query = "SELECT person.name, person.age FROM Person person WHERE person.name = :name"
)
@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  //CONSTRUCTORS
  public Person() { }                        //Forced by @Entity
  public Person(String name, Integer age) {  //To insert test Records
    this.name = name;
    this.age  = age;
  }

}
