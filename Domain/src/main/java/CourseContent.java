
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
}
