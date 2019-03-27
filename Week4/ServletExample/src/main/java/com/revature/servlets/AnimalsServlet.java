package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.pojos.Animals;
import com.revature.services.AnimalService;

/**
 * Servlet implementation class AnimalsServlet
 */
public class AnimalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AnimalService animalService = new AnimalService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnimalsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("This will give us an animal");
		String name = request.getPathInfo();
		System.out.println(name.substring(1));
		Animals a = animalService.findAnimalByName(name.substring(1));
		System.out.println(a);
/*		response.getWriter().write(
				"{\"name\":\"" + a.getName() +
				"\", \"breed\":\""+a.getBreed() +
				"\", \"color\":\""+a.getColor() +
				"\", \"age\":"+a.getAge() +
				"}"
				);*/
		ObjectMapper om = new ObjectMapper();
		String animalString = om.writeValueAsString(a);
		response.getWriter().write(animalString);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String body = request.getReader().readLine();
		System.out.println(body);
		ObjectMapper om = new ObjectMapper();
		Animals a = om.readValue(body, Animals.class);
		animalService.createAnimal(a);
		response.getWriter().write("Animal successfuly created");
	}

}
