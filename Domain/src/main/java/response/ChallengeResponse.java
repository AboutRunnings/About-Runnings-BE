package response;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChallengeResponse {

    private Long id;
    private String content;

    public static ChallengeResponse of(Long id, String content) {
        return ChallengeResponse.builder().id(id).content(content).build();
    }
}
