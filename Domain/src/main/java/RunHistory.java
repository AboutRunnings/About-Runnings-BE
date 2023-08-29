
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_run_history")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RunHistory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Double distance;

    private String takeTime;

    private Double slope;

    private Double startLatitude;

    private Double startLongitude;

    private Double endLatitude;

    private Double endLongitude;

    private String location;

    @Builder
    public RunHistory(
            Long userId,
            Double distance,
            String takeTime,
            Double slope,
            Double startLatitude,
            Double startLongitude,
            Double endLatitude,
            Double endLongitude,
            String location) {
        this.userId = userId;
        this.distance = distance;
        this.takeTime = takeTime;
        this.slope = slope;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
        this.location = location;
    }
}
