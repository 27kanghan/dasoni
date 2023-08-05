package signiel.heartsigniel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import signiel.heartsigniel.common.dto.Response;
import signiel.heartsigniel.model.alarm.AlarmService;
import signiel.heartsigniel.model.matching.MatchingService;
import signiel.heartsigniel.model.matching.code.MatchingCode;
import signiel.heartsigniel.model.member.Member;
import signiel.heartsigniel.model.rating.dto.TotalResultRequest;

@RestController
@RequestMapping("/api/match")
public class MatchingController {

    private final MatchingService matchingService;
    private final AlarmService alarmService;

    public MatchingController(MatchingService matchingService, AlarmService alarmService){
        this.matchingService = matchingService;
        this.alarmService = alarmService;
    }

    @PostMapping("/members/{memberId}")
    public ResponseEntity<Response> quickMatch(@PathVariable Long memberId){
        Response response = matchingService.quickFindMatch(memberId);


            return ResponseEntity.ok(response);
    }

    @DeleteMapping("/partymembers/{partyMemberId}")
    public ResponseEntity<Response> cancelQuickMatch(@PathVariable Long partyMemberId){
            Response response = matchingService.cancelFindMatch(partyMemberId);
            return ResponseEntity.ok(response);
    }

    @PostMapping("/enqueue/{memberId}")
    public ResponseEntity<Response> enqueueMember(@PathVariable Long memberId) {
        Member member = matchingService.findMemberById(memberId); // 멤버 정보를 가져옵니다.
        matchingService.enqueueMember(member); // 멤버를 큐에 추가합니다.
        return ResponseEntity.ok(Response.of(MatchingCode.ENQUEUE_SUCCESS, null)); // 성공 응답을 반환합니다.
    }

}
