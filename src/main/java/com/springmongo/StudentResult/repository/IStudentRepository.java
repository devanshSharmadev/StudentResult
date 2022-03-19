package com.springmongo.StudentResult.repository;

import com.springmongo.StudentResult.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends MongoRepository<Student,Integer> {

    List<Student> findBySchool(String school);

    @Query("{physicsMarks:{$gte:?0}}")
    List<Student> findByPhysicsMarks(int physicsMarks);

    @Query("{chemistryMarks:{$gte:?0}}")
    List<Student> findByChemistryMarks(int chemistryMarks);

    @Query("{mathsMarks:{$gte:?0}}")
    List<Student> findByMathsMarks(int mathsMarks);

}
