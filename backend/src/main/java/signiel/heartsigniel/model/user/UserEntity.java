package signiel.heartsigniel.model.user;

import lombok.*;
import signiel.heartsigniel.jpa.BaseTimeEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * UserEntity 정보
 */
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
public class UserEntity extends BaseTimeEntity {

    @Id @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name="login_id", unique = true, length = 20)
    private String loginId;

    @Column(length = 100)
    private String password;

    @Column(unique = true, length = 10)
    private String nickname;

    private int age;

    @Column(length = 10)
    private String gender;

    private Date birth;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "isblack")
    private boolean isBlack;

    @Column(length = 20)
    private String rank;

    private int meetingCount;

    @Column(name = "profile_image_src", length = 200)
    private String profileImageSrc;

}
