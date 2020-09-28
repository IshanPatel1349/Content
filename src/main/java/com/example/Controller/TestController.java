package com.example.Controller;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entities.Employee;

@RestController
public class TestController {

	@GetMapping(value = "/employee", produces = MediaType.ALL_VALUE)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}

	@GetMapping(value = "/employee", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> download() throws IOException {

		ClassPathResource resource = new ClassPathResource("J66398-Jul-2019.pdf");
		HttpHeaders header = new HttpHeaders();
		header.setContentLength(resource.contentLength());

		ResponseEntity<InputStreamResource> response = new ResponseEntity<InputStreamResource>(
				new InputStreamResource(resource.getInputStream()), header, HttpStatus.OK);

		return response;

	}


}
