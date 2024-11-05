package com.cursoSpring.course.repositories;

import com.cursoSpring.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
