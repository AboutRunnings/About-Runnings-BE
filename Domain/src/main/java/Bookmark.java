
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_bookmark")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bookmark extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long challengeId;

    private Long courseId;

    private BookmarkType bookmarkType;

    private Bookmark(Long userId, Long challengeId, Long courseId, BookmarkType bookmarkType) {
        this.userId = userId;
        this.challengeId = challengeId;
        this.courseId = courseId;
        this.bookmarkType = bookmarkType;
    }

    public Bookmark toEntity(
            Long userId, Long challengeId, Long courseId, BookmarkType bookmarkType) {
        return new Bookmark(userId, challengeId, courseId, bookmarkType);
    }
}
