package com.simplecoding.simpledms.jpa.auth.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member2Dto {

    private String email;
    private String password;
    private String fullname;
    private String codeName;


}
