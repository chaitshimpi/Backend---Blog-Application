package com.blopapplication.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blopapplication.blog.entity.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
