package com.springmongo.StudentResult.service;

import com.springmongo.StudentResult.exceptions.StudentNotFound;
import com.springmongo.StudentResult.model.Student;
import com.springmongo.StudentResult.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    private IStudentRepository studentRepository;


    @Autowired
    public void setStudentRepository(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.insert(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getByRollNumber(int studentRollNumber) throws StudentNotFound {
        return studentRepository.findById(studentRollNumber).orElseThrow(()->new StudentNotFound("Invalid Roll Number"));
    }

    @Override
    public List<Student> getBySchool(String schoolname) throws StudentNotFound {
        List<Student> student =studentRepository.findBySchool(schoolname);
        if(student.isEmpty())
            throw new StudentNotFound("Student with this School are not found");
        return student;
    }

    @Override
    public List<Student> getByPhysicsMarks(Integer pysicsMarks) throws StudentNotFound {
        List<Student> student=studentRepository.findByPhysicsMarks(pysicsMarks);
        if(student.isEmpty())
            throw new StudentNotFound("Student with this Physics Marks are not available");
        return student;
    }

    @Override
    public List<Student> getByChemistryMarks(Integer chemistryMarks) throws StudentNotFound {
        List<Student> student=studentRepository.findByChemistryMarks(chemistryMarks);
        if(student.isEmpty())
            throw new StudentNotFound("Student with this Chemistry Marks are not available");
        return student;
    }

    @Override
    public List<Student> getByMathsMarks(Integer mathsMarks) throws StudentNotFound {
        List<Student> student=studentRepository.findByMathsMarks(mathsMarks);
        if(student.isEmpty())
            throw new StudentNotFound("Student with this Maths Marks are not available");
        return student;
    }
}
