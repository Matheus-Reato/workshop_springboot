package com.cursoSpring.course.repositories;

import com.cursoSpring.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
