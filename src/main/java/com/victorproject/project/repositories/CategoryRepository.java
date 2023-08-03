package com.victorproject.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victorproject.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
		

}
