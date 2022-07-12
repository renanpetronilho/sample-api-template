package io.fylabs.sampleapi.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Slf4j
@ControllerAdvice
public class GlobalCustomException {

    @ResponseBody
    @ExceptionHandler(SampleNotFoundException.class)
    public ResponseEntity<MessageExceptionHandler> SampleNotFound(){
        return new ResponseEntity<>(MessageExceptionHandler.builder()
                .error("sample_not_found")
                .timestamp(new Date())
                .status(HttpStatus.NOT_FOUND.value())
                .build(), HttpStatus.NOT_FOUND);
    }

}