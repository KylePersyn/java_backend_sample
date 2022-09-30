package levvel.io.data;

import levvel.io.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

public class CommentRepository extends MongoRepository<Comment, String> {
    
    //create a query that will return the list of comments for a given blog id

}
