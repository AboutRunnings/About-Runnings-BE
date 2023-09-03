
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_like")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ContentLike extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long courseContentId;

    private ContentLike(Long userId, Long courseContentId) {
        this.userId = userId;
        this.courseContentId = courseContentId;
    }

    public ContentLike toEntity(Long userId, Long courseContentId) {
        return new ContentLike(userId, courseContentId);
    }
}
