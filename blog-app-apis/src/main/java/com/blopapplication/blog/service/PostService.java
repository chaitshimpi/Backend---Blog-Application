package com.blopapplication.blog.service;

import java.util.List;

import com.blopapplication.blog.entity.Post;
import com.blopapplication.blog.payloads.PostDto;
import com.blopapplication.blog.payloads.PostResponse;

public interface PostService {

	//create 

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

		//update 

		PostDto updatePost(PostDto postDto, Integer postId);

		// delete

		void deletePost(Integer postId);
		
		//get all posts
		
		PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	    List<PostDto> getAllPost();
		//get post by category
		
		PostDto getPostById(Integer postId);
		
		//get post by category
		
		List<PostDto> getPostsByCategory(Integer categoryId);
		
		//get post by user
	
		List<PostDto> getPostsByUser(Integer userId);
		
		//search post
		List<PostDto> searchPosts(String keyword);
}
