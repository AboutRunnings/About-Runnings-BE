
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_course_content")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CourseContent extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    private String location;

    private Double latitude;

    private Double longitude;

    private Double distance;

    private String takeTime;

    private Double slope;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<ContentLike> contentLikes = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<Comment> comments = new ArrayList<>();

    public void addContentLikes(ContentLike contentLike) {
        contentLikes.add(contentLike);
    }

    public void addComments(Comment comment) {
        comments.add(comment);
    }

    @Builder
    public CourseContent(
            String content,
            String location,
            Double latitude,
            Double longitude,
            Double distance,
            String takeTime,
            Double slope) {
        this.content = content;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
        this.takeTime = takeTime;
        this.slope = slope;
    }
}
