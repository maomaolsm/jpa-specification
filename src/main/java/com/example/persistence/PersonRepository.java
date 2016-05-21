package com.example.persistence;


import com.example.persistence.domain.PersonDAO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maomao on 16/4/1.
 */
public interface PersonRepository extends JpaRepository<PersonDAO,Long> {

}
