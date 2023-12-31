package signiel.heartsigniel.model.question;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import signiel.heartsigniel.common.dto.Response;
import signiel.heartsigniel.model.question.code.QuestionCode;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> makeQuestionList() {
        List<Question> questionList = questionRepository.randomQuestion();
        return questionList;
    }
}
