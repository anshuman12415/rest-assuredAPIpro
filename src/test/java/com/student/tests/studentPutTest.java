package com.student.tests;

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.student.model.Student;

import static com.jayway.restassured.RestAssured.*;

public class studentPutTest {
	/*
	 * @BeforeClass public static void init() { RestAssured.baseURI =
	 * "http://localhost"; RestAssured.port = 9191; RestAssured.basePath =
	 * "/student"; }
	 */

	@Test
	public void UpdateNewStudent() {
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("java");
		courses.add("C#");
		courses.add("C");
		
		Student student = new Student();
		student.setFirstName("Tejas");
		student.setLastName("KR");
		student.setEmail("abcdef@test.com");
		student.setProgramme("c++");
		student.setCourses(courses);
		
		given().contentType(ContentType.JSON).when().body(student).patch("/102").then().statusCode(200); 
		
	}
}
