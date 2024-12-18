package com.blopapplication.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blopapplication.blog.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
