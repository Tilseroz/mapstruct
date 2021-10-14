package cz.tilseroz.mapstruct.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {

    private Long id;
    private String name;
    private Address address;
    private String email;
    private String password;
    private boolean isActive;

}
