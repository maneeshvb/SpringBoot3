package com.example.project;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;


@RequestMapping(value = "/hospitals/{id}", method = RequestMethod.GET)
public @ResponseBody Hospital getHospital(@PathVariable("id") int id) throws Exception {

	Hospital hospital = this.hospitalService.getHospital(id);

    return hospital;
    }

@RequestMapping(value = "/hospitals", method = RequestMethod.GET)
public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
	
		//hospitalRepository.findAll().forEach(hospitalList::add);
	//hospitalList.add(hosp);
	//return hospitalList;
	return this.hospitalService.getAllHospitals();
    }


@RequestMapping(method=RequestMethod.POST, value="/hospitals")
//public ResponseEntity<String> addHospital(@RequestBody Hospital hospital  ) {
	public Hospital addHospital(@RequestBody Hospital hospital  ) {
	hospitalService.addHospital(hospital);
	return hospital;
}

@RequestMapping(method=RequestMethod.PUT, value="/hospitals/{id}")
//public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {
	public Hospital updateHospital(@RequestBody Hospital hospital) {
	hospitalService.updateHospital(hospital);
	return hospital;
}



//public void updateCategory(@RequestBody Category category, @PathVariable int id) {

     //frescoCourseService.updateCategory(category, id);

//}
@RequestMapping(method=RequestMethod.DELETE, value="/hospitals")
public ResponseEntity<Void> deleteHospital(@RequestBody Hospital hospital) {
	hospitalService.deleteHospital(hospital);
	return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
}

}
