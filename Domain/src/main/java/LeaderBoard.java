
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_leader_board")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LeaderBoard extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long challengeId;

    private Long userId;

    private String takeTime;

    private Double distance;

    private LeaderBoard(Long challengeId, Long userId, String takeTime, Double distance) {
        this.challengeId = challengeId;
        this.userId = userId;
        this.takeTime = takeTime;
        this.distance = distance;
    }

    public LeaderBoard toEntity(Long challengeId, Long userId, String takeTime, Double distance) {
        return new LeaderBoard(challengeId, userId, takeTime, distance);
    }
}
