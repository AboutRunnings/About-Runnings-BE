
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_comment")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comment;

    private Long userId;

    private Long courseContentId;

    private Comment(String comment, Long userId, Long courseContentId) {
        this.comment = comment;
        this.userId = userId;
        this.courseContentId = courseContentId;
    }

    public Comment toEntity(String comment, Long userId, Long courseContentId) {
        return new Comment(comment, userId, courseContentId);
    }
}
