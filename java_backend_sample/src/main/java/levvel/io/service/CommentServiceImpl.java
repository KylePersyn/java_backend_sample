package levvel.io.service;

import levvel.io.data.CommentRepository;
import levvel.io.model.Comment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {
    
    //create a comment repository
    private CommentRepository comRepo;


    //add comments method
    @Override
    public void addComment(String blogId, Comment comment){
        comRepo.save(comment);
    }


    //get comments method
    @Override
    public List<Comment> getComments(String blogId) {
        return comRepo.getComFromBlogId(blogId);
    }
}
