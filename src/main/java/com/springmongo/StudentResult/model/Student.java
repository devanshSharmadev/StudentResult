package com.springmongo.StudentResult.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Student {

    private String name;
    @Id
    private Integer rollNumber;
    private String school;
    private Integer physicsMarks;
    private Integer chemistryMarks;
    private Integer mathsMarks;


}
