package com.simplecoding.simpledms.jpa.auth.entity;


import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "TB_MEMBER2")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Member2 extends BaseTimeEntity {


    @Id
    private String email;
    private String password;
    private String fullname;
    private String codeName;


}
