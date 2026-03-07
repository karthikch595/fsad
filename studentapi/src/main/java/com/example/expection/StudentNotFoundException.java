package com.example.expection;
public class StudentNotFoundException extends RuntimeException {
 public StudentNotFoundException(String message) {
 super(message);
 }
}
