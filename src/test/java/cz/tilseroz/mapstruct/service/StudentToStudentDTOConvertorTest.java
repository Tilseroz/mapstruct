package cz.tilseroz.mapstruct.service;

import cz.tilseroz.mapstruct.dto.StudentDto;
import cz.tilseroz.mapstruct.entity.Address;
import cz.tilseroz.mapstruct.entity.Student;
import cz.tilseroz.mapstruct.mapper.StudentToStudentDTOMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentToStudentDTOConvertorTest {

    @Test
    void studentToStudentDTOConvertor() {
        StudentToStudentDTOConvertor studentToStudentDTOConvertor = new StudentToStudentDTOConvertor();
        Student student = createStudent();
        StudentDto studentDTO = studentToStudentDTOConvertor.studentToStudentDTOConvertor(student);
        assertEquals("Marcel", studentDTO.getUsername());
        assertEquals("heslo123", studentDTO.getPassword());
        assertEquals("test@example.cz", studentDTO.getEmail());
        assertEquals("Blansko", studentDTO.getAddress().getCity());
    }

    @Test
    void studentToStudentDTOConvertorWithMapStruct() {
        Student student = createStudent();
        StudentDto studentDTO = StudentToStudentDTOMapper.INSTANCE.map(student);
        assertEquals("Marcel", studentDTO.getUsername());
        assertEquals("heslo123", studentDTO.getPassword());
        assertEquals("test@example.cz", studentDTO.getEmail());
        assertEquals("Blansko", studentDTO.getAddress().getCity());
    }

    private Student createStudent() {
        return Student.builder()
                .name("Marcel")
                .address(new Address("Severská", "Blansko", "67809"))
                .id(5L)
                .isActive(true)
                .password("heslo123")
                .email("test@example.cz")
                .build();
    }
}