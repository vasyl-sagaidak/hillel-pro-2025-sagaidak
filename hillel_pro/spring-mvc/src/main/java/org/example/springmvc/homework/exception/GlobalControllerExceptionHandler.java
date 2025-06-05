package org.example.springmvc.homework.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Component("globalHandlerHomework")
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<ErrorBody> handleOrderNotFound(OrderNotFoundException e) {
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorBody("order_not_found",
                "Order with such id not found."), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorBody> handleGlobalException(Exception e) {
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorBody("internal_server_error",
                "Please inform backend crew asap."), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @AllArgsConstructor
    @Getter
    static class ErrorBody {
        private String errorName;
        private String errorBody;
    }
}
