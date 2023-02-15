package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/*Jpa repository is exists in Spring Data JPA dependencies is
 * its contains all the crud operations
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
