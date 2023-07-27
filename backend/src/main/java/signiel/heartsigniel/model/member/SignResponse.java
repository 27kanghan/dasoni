package signiel.heartsigniel.model.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignResponse {
    private Long memberId;

    private String loginId;

    private String nickname;

    private String gender;

    private LocalDate birth;

    private String phoneNumber;

    private boolean isBlack;

    private int rank;

    private int meetingCount;

    private String profileImageSrc;

    private String job;

    private int siDo;

    private int guGun;

    private List<Authority> roles = new ArrayList<>();

    private int remainLife;

    private String token;
}
