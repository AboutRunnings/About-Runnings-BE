import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "tbl_challenge")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Challenge extends BaseEntity{

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
}
