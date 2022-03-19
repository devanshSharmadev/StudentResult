package com.springmongo.StudentResult.service;

import com.springmongo.StudentResult.exceptions.StudentNotFound;
import com.springmongo.StudentResult.model.Student;

import java.util.List;

public interface IStudentService {

    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int doctorId);

    List<Student> getAllStudents();

    Student getByRollNumber(int studentRollNumber) throws StudentNotFound;

    List<Student> getBySchool(String schoolname) throws StudentNotFound;
    List<Student> getByPhysicsMarks(Integer pysicsMarks) throws StudentNotFound;
    List<Student> getByChemistryMarks(Integer chemistryMarks) throws StudentNotFound;
    List<Student> getByMathsMarks(Integer mathsMarks) throws StudentNotFound;



}
