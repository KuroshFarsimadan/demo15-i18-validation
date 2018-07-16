package ir.kuroshfarsimadan.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ir.kuroshfarsimadan.bean.Person;
import ir.kuroshfarsimadan.bean.PersonImpl;
import ir.kuroshfarsimadan.dao.PersonDAO;

@Controller
@RequestMapping(value = "/persons")
public class PersonController {

	@Inject
	private PersonDAO dao;

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	// Creating a form
	@RequestMapping(value = "new", method = RequestMethod.GET)
	public String getCreateForm(Model model) {
		Person emptyPerson = new PersonImpl();
		emptyPerson.setFirstname("defaultName");
		model.addAttribute("person", emptyPerson);
		return "person/createForm";
	}

	// Receiving the form data
	@RequestMapping(value = "new", method = RequestMethod.POST)
	public String create(@ModelAttribute(value = "person") @Valid PersonImpl person, BindingResult result) {
		if (result.hasErrors()) {
			return "person/createForm";
		} else {
			dao.save(person);
			return "redirect:/persons/" + person.getId();
		}
	}

	// Showing the person information
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public String getView(@PathVariable Integer id, Model model) {
		Person person = dao.find(id);
		model.addAttribute("person", person);
		return "person/view";
	}

}
