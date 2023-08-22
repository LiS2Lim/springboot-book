package com.example.demo.board.Answer;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnswerService {
  private final AnswerRepository answerRepository;

  public List<Answer> getAnswers() {
    return answerRepository.findAll();
  }

  public Answer getAnswer(int id) {
    Optional<Answer> answer = answerRepository.findById(id);
    if(answer.isEmpty()) throw new RuntimeException("Answer is not found");
    return answer.get();
  }

  public int createAnswer(Answer answer) {
    answerRepository.save(answer);
    return answer.getId();
  }

  public int deleteAnswer(int id) {
    Answer answer = getAnswer(id);
    answerRepository.delete(answer);
    return answer.getId();
  }
}
