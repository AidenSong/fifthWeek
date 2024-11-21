package hello.fifthweek.interfaces.member;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MemberExceptionHandler extends RuntimeException {


    // 잔액 부족 예외 처리
    @ExceptionHandler(MemberExceptionHandler.class)
    public ResponseEntity<String> handleInsufficientBalanceException(MemberExceptionHandler ex) {
        // 사용자에게 반환할 커스텀 메세지
        String message = "결제 실패 : " + ex.getMessage();
        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
    }
}
