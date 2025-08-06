package com.simplecoding.simpledms.auth.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MemberDto {


    private String email;
    private String password;
    private String name;
    private String codeName;

}
