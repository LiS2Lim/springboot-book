package com.example.demo.board.Post;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
  private final PostRepository postRepository;

  public int createPost(Post post) {
    postRepository.save(post);
    return post.getId();
  }

  public List<Post> getPosts() {
    return postRepository.findAll();
  }

  public Post getPost(int id) {
    Optional<Post> post = postRepository.findById(id);
    if(post.isEmpty()) throw new RuntimeException("Post is not found");
    return post.get();
  }

  public int deletePost(int id) {
    Post post = getPost(id);
    postRepository.delete(post);
    return post.getId();
  }
}
