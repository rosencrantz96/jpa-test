package com.example.entity;

import java.util.Date;

import javax.persistence.*;

import com.example.constant.MemberClass;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
	
	@Id // primary key!! pk로 쓸 속성에는 @Id를 붙여주면 된다
	@Column(name="member_id") // 데이터베이스의 column! 컬럼 이름을 member_id로 하는거
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Enumerated(EnumType.STRING) // Enum 타입을 쓸 경우 무조건 붙여야 함
	@Column
	private MemberClass memberClass;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
}
