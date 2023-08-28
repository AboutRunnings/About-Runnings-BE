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
}
