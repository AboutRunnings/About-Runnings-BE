
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
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

    private String startLocation;

    private String endLocation;

    private Double startLatitude;

    private Double startLongitude;

    private Double endLatitude;

    private Double endLongitude;

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

    private CourseContent(
            String content,
            String startLocation,
            String endLocation,
            Double startLatitude,
            Double endLatitude,
            Double startLongitude,
            Double endLongitude,
            Double distance,
            String takeTime,
            Double slope) {
        this.content = content;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startLatitude = startLatitude;
        this.endLatitude = endLatitude;
        this.startLongitude = startLongitude;
        this.endLongitude = endLongitude;
        this.distance = distance;
        this.takeTime = takeTime;
        this.slope = slope;
    }

    public CourseContent toEntity(
            String content,
            String startLocation,
            String endLocation,
            Double startLatitude,
            Double endLatitude,
            Double startLongitude,
            Double endLongitude,
            Double distance,
            String takeTime,
            Double slope) {
        return new CourseContent(
                content,
                startLocation,
                endLocation,
                startLatitude,
                endLatitude,
                startLongitude,
                endLongitude,
                distance,
                takeTime,
                slope);
    }
}
