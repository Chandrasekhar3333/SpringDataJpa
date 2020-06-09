package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.demo.entities.ContactMaster;
import com.example.demo.repository.ContactMasterRepository;


@SpringBootApplication
public class SpringdatajpaexampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringdatajpaexampleApplication.class, args);
		ContactMasterRepository cmr=ctx.getBean(ContactMasterRepository.class);
System.out.println(cmr.getClass().getName());
ContactMaster cm=new ContactMaster();
cm.setContract_id(101);
cm.setContact_nm("chandra");
cm.setContact_number(90123456);
cmr.save(cm);
		
}

}
