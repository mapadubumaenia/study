package com.simplecoding.jpaexam.common;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

//TODO: DB는 언더바 표기법(컬럼) VS 자바 카멜표기법(필드)
//TODO: JPA에서 이 클래스는 공통 클래스라고 지정하는 어노테이션(상속용)
@MappedSuperclass
//TODO:JPA에서 공통클래스 필드(생성/수정 일시)를 자동으로 현재날짜를 넣어주는 기능을 하는 어노테이션
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    //TODO: JPA에서 INSERT(추가)가 되었을때 자동으로 현재날짜를 이 필드에 넣어주는 어노테이션
    @CreatedDate
    //TODO: (참고) 수정이 될때 기본적으로 생성일시 필드값도 변함(그것을 막는 기능)
    @Column(updatable = false)
    private LocalDateTime insertTime; //생성일시
    //TODO: JPA에서 UPDATE(수정)가 되었을때 자동으로 현재날짜를 이 필드에 넣어주는 어노테이션
    @LastModifiedDate
    private LocalDateTime  updateTime; //수정일시
}

