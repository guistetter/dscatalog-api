package com.dev.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
