package com.yx.common;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//調控訊息
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

//出現嘅唔同嘅異常我哋都需要用唔同嘅區分
//   用ExceptionHandler呢個方法
    @ExceptionHandler({MethodArgumentNotValidException.class})

    public ResponseEntity<DataInfo<Void>> handleValidation(Exception ex) {

    }
}
