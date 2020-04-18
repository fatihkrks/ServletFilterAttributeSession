package request.dispatch.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import request.dispatch.model.Person;

@WebServlet("/personController")
public class PersonController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//controller seviyesinde veritabanı bağlantısı yapılmaz
		Person person1=new Person("levent", "erguder");
		Person person2=new Person("lvnt", "erger");
		Person person3=new Person("lvent", "ergur");
		Person person4=new Person("lent", "euder");
		List<Person> personList=new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		
		req.setAttribute("persons", personList);
		//bu kısımlar query sonrası veritabanından gelsin .
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/ServletJsp4/WebContent/person/personView.jsp");
		dispatcher.forward(req, resp);
	}
}
