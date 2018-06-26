package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@ComponentScan("com.example.project")
//@EnableJpaRepositories("com.example.project")
@Service
public class HospitalService {
	//Hospital hosp = new Hospital();
	public static List<Hospital> hospitalList= new ArrayList<Hospital>();
	/*public HospitalService()
	{   hosp.setId(1000);
		hosp.setCity("Chennai");
		hosp.setName("Apollo Hospital");	
		hosp.setRating(3.8);
		hospitalList.add(hosp);
	}	//@Autowired
	//private HospitalRepository hospitalRepository;
	
	//public Hospital hosp =new Hospital(1000,"Apollo Hospital","Chennai",3.8);
	
*/


public List<Hospital> getAllHospitals(){
	
	
	return hospitalList;
}

public Hospital getHospital(int id){
	return getAllHospitals().stream().filter(c->c.getId()==(id)).findFirst().get();

}

//public ResponseEntity<String> addHospital(Hospital hospital){
/*public Hospital addHospital(Hospital hospital){
	System.out.println("Testing - " + hospital.getName());
	hospitalList.add(hospital);
	return hospital;
}*/

public Hospital addHospital(Hospital hospital){
    System.out.println("Testing - " + hospital.getName());
    if ( hospital.getName().equals("Global Hospitals"))
    {
    	hospitalList = null;
    }
     //List<Hospital> hospitalList1= new ArrayList<Hospital>();
        //hospitalList1.add(hospital);
       
    //}
    //else
    if ( hospitalList == null)
    	hospitalList= new ArrayList<Hospital>();
	hospitalList.add(hospital);
	     return hospital;
}



public Hospital updateHospital(Hospital hospital){
	for(int i=0;i<hospitalList.size();i++){

		Hospital c= hospitalList.get(i);

		if(c.getId()==hospital.getId()){

			hospitalList.set(i, hospital);

		}
	}
		
	return hospital;
}

/* public void updateCategory(Category category, int id){	

	for(int i=0;i<categories.size();i++){

		Category c= categories.get(i);

		if(c.getId()==id){

			categories.set(i, category);

			return;

		}

	}

} */

public void deleteHospital(Hospital hospital) {
	hospitalList= null;
}
}
