
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Table(name = "tbl_challenge")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Challenge extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private String title;

    private String content;
    
    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long runHistoryId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<LeaderBoard> leaderBoards = new ArrayList<>();

    public void addLeaderBoards(LeaderBoard leaderBoard) {
        leaderBoards.add(leaderBoard);
    }

    private Challenge(Long userId,
                      String title,
                      String content,
                      LocalDateTime startDate,
                      LocalDateTime endDate,
                      Long runHistoryId) {
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.startDate = startDate;
        this.endDate = endDate;
        this.runHistoryId = runHistoryId;
    }

    public Challenge toEntity(Long userId,
                              String title,
                              String content,
                              LocalDateTime startDate,
                              LocalDateTime endDate,
                              Long runHistoryId) {
        return new Challenge(userId, title, content, startDate, endDate, runHistoryId);
    }
}
