package signiel.heartsigniel.model.room.code;

import signiel.heartsigniel.common.code.ResponseCode;

public enum RoomCode implements ResponseCode {
    NOT_FOUND_ROOM(1200, "해당하는 방이 존재하지 않습니다."),
    FULL_ROOM(1201, "인원이 가득 찼습니다."),
    TIME_OUT_ROOM(1202, "해당 방의 일정 시간이 이미 지났습니다."),
    USER_OUT_FROM_ROOM(1203, "방에서 성공적으로 나갔습니다."),
    KICKED_OUT(1204, "강퇴가 완료되었습니다."),
    ENTER_USER_TO_ROOM(1205, "사용자 1명이 방에 입장했습니다."),
    CHAT(1206, "사용자 1명이 채팅을 보냈습니다."),
    CHANGED_ROOM_INFO(1207, "방 정보가 업데이트 되었습니다."),
    DELEGATE(1208, "방장이 위임되었습니다."),
    SUCCESS_PARTICIPATE_ROOM(1209, "방에 참가 완료했습니다."),
    NOT_PARTICIPATE_ROOM(1210, "참가하지 않은 방입니다."),
    ABLE_TO_PARTICIPATE(1212, "해당 방에 참가할 수 있습니다."),
    PARTICIPATING_ROOM(1214, "이미 참여하고 있는 방입니다."),
    DEFAULT_ROOM_IMAGE(1216, "해당 방 이미지가 기본 값으로 설정되어있습니다."),
    NO_PERMISSION(1217, "해당 기능을 수행할 권한이 없습니다."),
    NOT_MODIFY_PARTICIPANT_COUNT(1218, "현재 인원 수보다 작은 인원으로 설정할 수 없습니다."),
    ALREADY_IN_OTHER_ROOM(1219, "이미 다른 방에 참가중입니다."),
    RATING_TOO_LOW(1220, "레이팅이 낮아 방에 참여할 수 없습니다."),
    START_MEETING_SUCCESSFUL(1221, "미팅이 성공적으로 시작되었습니다."),
    END_MEETING_SUCCESSFUL(1222, "미팅이 종료되었습니다."),
    ROOM_DELETED(1223, "방이 삭제되었습니다."),
    INSUFFICIENT_PARTICIPANTS(1224, "참가인원이 부족합니다."),
    MIDWAY_EXIT(1225, "미팅 진행중에 퇴장하셨습니다."),
    INVALID_ROOM_TYPE(1226, "사설방은 큐에 들어가지 않습니다.");
    ;


    private final int code;
    private final String message;

    RoomCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

}

