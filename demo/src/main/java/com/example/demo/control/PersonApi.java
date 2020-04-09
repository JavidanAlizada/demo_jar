package com.example.demo.control;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Address;
import com.example.demo.domain.FullName;
import com.example.demo.domain.Gender;
import com.example.demo.domain.Person;
import com.example.demo.domain.User;

@RestController
@RequestMapping("/api")
public class PersonApi {
	
	private List<Person> list = new ArrayList<Person>();
	
	@PostConstruct
	public void init() {
		
		FullName fullName = new FullName();
		fullName.setName("Javidan");
		fullName.setSurname("Alizada");
		fullName.setFatherName("Niyaz");
		
		Address address = new Address();
		address.setCountry("Azerbaijan");
		address.setCity("Baku");
		address.setDistrict("Khatai");
		
		User user = new User();
		user.setEmail("javidanalizada99@gmail.com");
		user.setPassword("javidan123");
		
		Person person = new Person();
		person.setId(1);
		person.setFullName(fullName);
		person.setUser(user);
		person.setAddress(address);
		person.setAge(20);
		person.setGender(Gender.MALE);
		
		FullName fullName2 = new FullName();
		fullName2.setName("Sahib");
		fullName2.setSurname("Babayev");
		fullName2.setFatherName("Yashar");
		
		Address address2 = new Address();
		address2.setCountry("Azerbaijan");
		address2.setCity("Baku");
		address2.setDistrict("Yasamal");
		
		User user2 = new User();
		user2.setEmail("sahib98@gmail.com");
		user2.setPassword("sahib9898");
		
		Person person2 = new Person();
		person2.setId(2);
		person2.setFullName(fullName2);
		person2.setUser(user2);
		person2.setAddress(address2);
		person2.setAge(21);
		person2.setGender(Gender.MALE);
		
		
		FullName fullName3 = new FullName();
		fullName3.setName("Fiona");
		fullName3.setSurname("Leben");
		fullName3.setFatherName("Nanlon");
		
		Address address3 = new Address();
		address3.setCountry("Spain");
		address3.setCity("Madrid");
		address3.setDistrict("Reis");
		
		User user3 = new User();
		user3.setEmail("fionaLeben@gmail.com");
		user3.setPassword("fiona43");
		
		Person person3 = new Person();
		person3.setId(3);
		person3.setFullName(fullName3);
		person3.setUser(user3);
		person3.setAddress(address3);
		person3.setAge(18);
		person3.setGender(Gender.FEMALE);
		
		list.add(person);
		list.add(person2);
		list.add(person3);
		
	}

	@GetMapping("/index")
	public String getIndex() {
		return "Hello Admin today is : "+new Date();
	}
	
	@GetMapping("/list")
	public List<Person> getPersonList(){
		return list;
	}
	
	@GetMapping("/person")
	public ResponseEntity<Person> getPersonById(@ModelAttribute User user){
		Person person = list.stream().filter(l -> (l.getUser().getEmail().equalsIgnoreCase(user.getEmail())
								   		&&(l.getUser().getPassword().equals(user.getPassword()))))
										.findAny().orElse(null);
		return new ResponseEntity<Person>(person, HttpStatus.FOUND);
	}
}







