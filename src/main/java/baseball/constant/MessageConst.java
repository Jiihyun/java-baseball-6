package baseball.constant;

public class MessageConst {
    public final static String GAME_START_MSG = "숫자 야구 게임을 시작합니다.";
    public final static String STRIKE = "스트라이크";
    public final static String BALL = "볼";
    public final static String NOTHING = "낫싱";
    public final static String INPUT_NUMBER_MSG = "숫자를 입력해주세요 : ";
    public final static String GAME_OVER_MSG = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public final static String RESTART_OR_NOT_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public final static String RESTART_FORMAT = "1";
    public final static String EXIT_FORMAT = "2";
    //TODO: 에러 메세지들은 exception 패키지 만들어서 그 안에 ErrorMessage enum으로 따로 정리 & 에러 상속해주기
    public final static String NUMBER_INPUT_FORMAT_EXCEPTION = "[ERROR] 숫자만 입력해주세요.\n";
    public final static String STRING_INPUT_FORMAT_EXCEPTION = "[ERROR] 입력값이 빈 문자열 또는 공백입니다.\n";
    public final static String NUMBER_SIZE_EXCEPTION = "[ERROR] 세자리수를 입력해주세요.\n";
    public final static String NUMBER_DUPLICATION_EXCEPTION = "[ERROR] 숫자가 중복되었습니다.\n";
    public final static String NUMBER_RANGE_EXCEPTION = "[ERROR] 1이상 9이하 사이의 숫자를 입력해주세요.\n";
    public final static String RESTART_FORMAT_EXCEPTION = "[ERROR] 1 혹은 2를 입력해주세요.\n";
}
