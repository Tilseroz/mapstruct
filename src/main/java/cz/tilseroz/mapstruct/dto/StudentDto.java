package cz.tilseroz.mapstruct.dto;

import cz.tilseroz.mapstruct.entity.Address;
import lombok.Data;

@Data
public class StudentDto {

    private Long id;
    private String username;
    private Address address;
    private String email;
    private String password;
    private boolean isActive;
    private String title;
}
