package cz.tilseroz.mapstruct.service;

import cz.tilseroz.mapstruct.dto.StudentDto;
import cz.tilseroz.mapstruct.entity.Address;
import cz.tilseroz.mapstruct.entity.Record;
import cz.tilseroz.mapstruct.entity.Student;
import cz.tilseroz.mapstruct.mapper.StudentToStudentDtoMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentToStudentDtoConvertorTest {

    @Test
    void studentToStudentDTOConvertor() {
        StudentToStudentDtoConvertor studentToStudentDTOConvertor = new StudentToStudentDtoConvertor();
        Student student = createStudent();
        StudentDto studentDTO = studentToStudentDTOConvertor.studentToStudentDTOConvertor(student);


        assertEquals("Marcel", studentDTO.getUsername());
        assertEquals("heslo123", studentDTO.getPassword());
        assertEquals("test@example.cz", studentDTO.getEmail());
        assertEquals("Blansko", studentDTO.getAddress().getCity());
        assertEquals("titul", studentDTO.getTitle());
//        assertEquals(null, studentDTO.getTitle());
    }

    @Test
    void studentToStudentDTOConvertorWithMapStruct() {
        Student student = createStudent();
        StudentDto studentDTO = StudentToStudentDtoMapper.INSTANCE.map(student);


        assertEquals("Marcel", studentDTO.getUsername());
        assertEquals("heslo123", studentDTO.getPassword());
        assertEquals("test@example.cz", studentDTO.getEmail());
        assertEquals("Blansko", studentDTO.getAddress().getCity());
        assertEquals("titul", studentDTO.getTitle());
//        assertEquals(null, studentDTO.getTitle());
    }

    private Student createStudent() {
        return Student.builder()
                .name("Marcel")
                .address(new Address("Severská", "Blansko", "67809"))
                .id(5L)
                .isActive(true)
                .password("heslo123")
                .email("test@example.cz")
                .record(new Record("titul", "note"))
//                .record(null)
                .build();
    }
}