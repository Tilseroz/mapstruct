package cz.tilseroz.mapstruct.mapper;

import cz.tilseroz.mapstruct.dto.StudentDto;
import cz.tilseroz.mapstruct.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentToStudentDtoMapper {

    StudentToStudentDtoMapper INSTANCE = Mappers.getMapper(StudentToStudentDtoMapper.class);

    @Mapping(source = "name", target = "username")
    @Mapping(source = "record.title", target = "title")
    StudentDto map(Student student);
}
