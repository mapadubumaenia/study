package egovframework.example.emp.service;

import egovframework.example.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class EmpVO extends Criteria{

//	ENO	NUMBER
//	ENAME	VARCHAR2(255 BYTE)
//	JOB	VARCHAR2(255 BYTE)
//	MANAGER	NUMBER
//	HIREDATE	VARCHAR2(255 BYTE)
//	SALARY	NUMBER
//	COMMISSION	NUMBER
//	DNO	NUMBER
	
	private int eno;
	private String ename;
	private String job;
	private int manager;
	private String hiredate;
	private int salary;
	private int commission;
	private int dno;
	
	
	
}
