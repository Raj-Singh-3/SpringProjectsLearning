package com.cts.jpa.SpringDataJPA_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa1Application.class, args);
		System.out.println("Hello world");
	}

}

// <============================== Better way to use lombok==============================>
//import lombok.*;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class Student {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	private String name;
//	private String email;
//}
