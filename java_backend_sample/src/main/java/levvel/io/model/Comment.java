package levvel.io.model;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Data
public class Comment {
    
    //create an id for the comment
    @Id
    String id;

    //date and time
    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    //information for the comment json
    //blogid
    String blogId;
    //author
    String author;
    //text
    String text;

}
