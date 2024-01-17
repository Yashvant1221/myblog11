package com.myblog.com.myblog11.service;

import com.myblog.com.myblog11.payLoad.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto getPostById(long id);

    List<PostDto> getAllPosts();
}
