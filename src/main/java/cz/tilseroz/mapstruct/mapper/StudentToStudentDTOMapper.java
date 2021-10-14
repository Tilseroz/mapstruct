package cz.tilseroz.mapstruct.mapper;

import cz.tilseroz.mapstruct.dto.StudentDto;
import cz.tilseroz.mapstruct.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentToStudentDTOMapper {

    StudentToStudentDTOMapper INSTANCE = Mappers.getMapper(StudentToStudentDTOMapper.class);

    @Mapping(source = "name", target = "username")
    StudentDto map(Student student);
}
