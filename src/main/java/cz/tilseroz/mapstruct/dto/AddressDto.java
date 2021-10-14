package cz.tilseroz.mapstruct.dto;

import lombok.Data;

@Data
public class AddressDto {

    private String street;
    private String city;
    private String zipcode;
}
