package com.simplecoding.simpledms.auth.entity;


import com.simplecoding.simpledms.common.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity                                                //JPA에서 관리하겠다는 표시 어노테이션
@Table(name = "TB_MEMBER")                               //엔티티와 테이블명을 기억하라는 어노테이션


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Member extends BaseTimeEntity {

    @Id
    private String email;
    private String password;
    private String name;
    private String codeName;

}
