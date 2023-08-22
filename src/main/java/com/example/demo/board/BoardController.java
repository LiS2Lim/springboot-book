package com.example.demo.board;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.board.Answer.AnswerService;
import com.example.demo.board.Post.Post;
import com.example.demo.board.Post.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class BoardController {
  private final PostService postService;
  private final AnswerService answerService;

  @PostMapping
  public void createPost(Post post) {
    postService.createPost(post);
  }

  @GetMapping
  public List<Post> getPosts() {
    return postService.getPosts();
  }

  @GetMapping("/{id}")
  public Post getPost(@PathVariable int id) {
    return postService.getPost(id);
  }

}
