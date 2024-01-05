package com.myblog.com.myblog11.service.impl;

import com.myblog.com.myblog11.entity.Post;
import com.myblog.com.myblog11.payLoad.PostDto;
import com.myblog.com.myblog11.repository.PostRepository;
import com.myblog.com.myblog11.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        // Create a Post entity from the PostDto
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        // Save the entity using the repository
        Post savedPost = postRepository.save(post);

        // Convert the saved entity back to a PostDto and return it
        PostDto dto = new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        return dto;
    }
}
