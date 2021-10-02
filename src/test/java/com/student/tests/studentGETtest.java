package com.student.tests;

import static org.hamcrest.Matchers.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class studentGETtest {

	@BeforeClass
	public static void init() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 9191;
		RestAssured.basePath = "/student";
	}

	/*
	 * @Test public void getAllstudentdata() {
	 * 
	 * Response response = given().when().get("/list"); //
	 * System.out.print(response.body().asString());
	 * System.out.println(response.body().prettyPrint()); // to print json format
	 * print
	 * 
	 * given().when().get("/list").then().statusCode(200);
	 * 
	 * }
	 * 
	 * @Test public void getStudentInfo() { Response response =
	 * given().when().get("/1"); System.out.println(response.body().prettyPrint());
	 * }
	 */

	@Test
	public void getStudentfromME() {
		Response response = given()
				.when().
				get("/list?programme=Mechanical Engineering&limit=2");
		System.out.println(response.body().prettyPeek());
	}
	@Test
	public void getStudentfromME2() {
		Response response2 = given().param("programme", "Mechanical Engineering").param("limit", 2).when().get("/list");
				
		System.out.println(response2.body().prettyPeek());
	}
}
