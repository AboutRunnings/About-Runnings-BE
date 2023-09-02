
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_system_course_content")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SystemCourseContent {

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

    private SystemCourseContent(
            String content,
            String startLocation,
            String endLocation,
            Double startLatitude,
            Double startLongitude,
            Double endLatitude,
            Double endLongitude,
            Double distance,
            String takeTime,
            Double slope) {
        this.content = content;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
        this.distance = distance;
        this.takeTime = takeTime;
        this.slope = slope;
    }

    public SystemCourseContent toEntity(
            String content,
            String startLocation,
            String endLocation,
            Double startLatitude,
            Double startLongitude,
            Double endLatitude,
            Double endLongitude,
            Double distance,
            String takeTime,
            Double slope) {
        return new SystemCourseContent(
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
