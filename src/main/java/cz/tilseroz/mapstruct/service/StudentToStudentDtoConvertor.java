package cz.tilseroz.mapstruct.service;

import cz.tilseroz.mapstruct.dto.StudentDto;
import cz.tilseroz.mapstruct.entity.Student;
import cz.tilseroz.mapstruct.mapper.StudentToStudentDtoMapper;

public class StudentToStudentDtoConvertor {

    public StudentDto studentToStudentDTOConvertor(Student student) {
        StudentDto studentDTO = new StudentDto();
        studentDTO.setId(student.getId());
        studentDTO.setUsername(student.getName());
        studentDTO.setAddress(student.getAddress());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setActive(student.isActive());
        studentDTO.setPassword(student.getPassword());
        studentDTO.setTitle(student.getRecord().getTitle());
        return studentDTO;
    }


    public StudentDto studentToStudentDTOConvertorWithMapStruct(Student student) {
        return StudentToStudentDtoMapper.INSTANCE.map(student);
    }
}
