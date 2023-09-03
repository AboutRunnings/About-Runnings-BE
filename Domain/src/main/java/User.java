
import jakarta.persistence.*;
import lombok.AccessLevel;
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

    private Integer age;

    private String profileImageUrl;

    private User(
            String name,
            String nickName,
            String email,
            GenderType genderType,
            Integer age,
            String profileImageUrl) {
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.genderType = genderType;
        this.age = age;
        this.profileImageUrl = profileImageUrl;
    }

    public User toEntity(
            String name,
            String nickName,
            String email,
            GenderType genderType,
            Integer age,
            String profileImageUrl) {
        return new User(name, nickName, email, genderType, age, profileImageUrl);
    }
}
