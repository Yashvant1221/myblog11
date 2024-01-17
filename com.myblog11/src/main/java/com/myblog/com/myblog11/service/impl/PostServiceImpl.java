package com.myblog.com.myblog11.service.impl;

import com.myblog.com.myblog11.entity.Post;
import com.myblog.com.myblog11.exception.ResourceNotFoundException;
import com.myblog.com.myblog11.payLoad.PostDto;
import com.myblog.com.myblog11.repository.PostRepository;
import com.myblog.com.myblog11.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {  // This is 2nd Way of dependency injection called as constructor based
        this.postRepository = postRepository;            // dependency injection. 1st way is @Autowired annotation dependency injection.
    }

    @Override
    public PostDto createPost(PostDto postDto) {

        // Create a Post entity from the PostDto by calling method because entity class is applicable to interact with database.
        Post post = mapToEntity(postDto);

        // Save the entity using the repository
        Post savedPost = postRepository.save(post);

        // Convert the saved entity to a PostDto by calling method and return it
        PostDto dto = mapToDto(savedPost);
        return dto;
    }

    @Override
    public PostDto getPostById(long id) {
        Post post = postRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Post Not Found with Id: "+id)
        );

        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        dto.setDescription(post.getDescription());
        return dto;
    }

    @Override
    public List<PostDto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        List<PostDto> dtos = posts.stream().map(p -> mapToDto(p)).collect(Collectors.toList());
        return dtos;
    }

    // This method is responsible for convert Entity into Dto
    PostDto mapToDto(Post post){
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        return dto;
    }

    // This method is responsible for convert Dto into Entity
    Post mapToEntity(PostDto postDto){
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;
    }

}
