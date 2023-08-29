
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tbl_user")
@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String nickName;

    private String email;

    @Enumerated(EnumType.STRING)
    private GenderType genderType;

    private String ageRange;

    private String profileImageUrl;

    @Builder
    public User(
            String name,
            String nickName,
            String email,
            GenderType genderType,
            String ageRange,
            String profileImageUrl) {
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.genderType = genderType;
        this.ageRange = ageRange;
        this.profileImageUrl = profileImageUrl;
    }
}
