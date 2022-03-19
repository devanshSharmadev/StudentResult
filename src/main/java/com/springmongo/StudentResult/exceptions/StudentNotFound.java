package com.springmongo.StudentResult.exceptions;

public class StudentNotFound extends RuntimeException{

    public StudentNotFound() {
        super();
    }

    public StudentNotFound(String message) {
        super(message);
    }
}
