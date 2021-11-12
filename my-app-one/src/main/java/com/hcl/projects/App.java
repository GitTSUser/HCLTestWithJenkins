package com.hcl.projects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hcl.projects.beans.Employ;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext("com.hcl.projects");

		Employ employ = ioc.getBean(Employ.class);

		System.out.println(employ);


		System.out.println("employ id is:"+employ.getName());

	}
}
