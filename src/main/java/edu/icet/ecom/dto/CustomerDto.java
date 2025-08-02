package edu.icet.ecom.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class CustomerDto {

    private Integer id;
    private String name;
    private  String email;
    private  String mobile;
}
