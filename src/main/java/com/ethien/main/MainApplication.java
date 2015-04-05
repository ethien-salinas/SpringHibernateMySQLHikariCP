package com.ethien.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ethien.dao.PersonaDAO;
import com.ethien.model.Persona;

public class MainApplication {

	public static void main(String[] args) {

		// ***** Spring context call *****
		ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("spring-ctx.xml");

		PersonaDAO personDAO = cxt.getBean("personaDAOImpl", PersonaDAO.class);

		Persona person = new Persona();
		person.setNombre("Elizabeth");
		person.setPais("México");

		//personDAO.save(person);

		System.out.println("Person::" + person);

		List<Persona> list = personDAO.list();

		for (Persona p : list) {
			System.out.println("Person List::" + p);
		}
		
		System.out.println(personDAO.getPersonaByNombre("ETHIEN"));

		// ***** Spring close *****
		cxt.close();
	}
}