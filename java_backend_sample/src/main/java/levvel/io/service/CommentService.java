package levvel.io.service;

import levvel.io.model.Comment;

import java.util.List;

public interface CommentService {
    
    //add comment class definition
    void addComment(String blogId, Comment comment);


    //get comments class definition
    List<Comment> getComments(String blogId);


}
