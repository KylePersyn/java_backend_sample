package levvel.io.data;

import levvel.io.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    
    //create a query that will return the list of comments for a given blog id
    //the query will pull the id that can be passed through into the getComFromBlogId method
    @Query("{blogId :?0}")
    List<Comment> getComFromBlogId(String blogId);
}
