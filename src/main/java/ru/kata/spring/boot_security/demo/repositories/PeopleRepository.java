package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.entity.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Long> {
    Person findByUsername(String userName);
}