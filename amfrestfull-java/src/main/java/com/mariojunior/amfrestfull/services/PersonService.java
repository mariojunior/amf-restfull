/**
 * 
 */
package com.mariojunior.amfrestfull.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariojunior.amfrestfull.dao.PersonMockDao;
import com.mariojunior.amfrestfull.model.Person;

/**
 * Mediate data between controllers and DAO. 
 * Bussiness logic could be here.
 * 
 * @author Mario Junior
 *
 */
@Service
public class PersonService
{
	private PersonMockDao dao;
	
	/**
	 * @param dao the dao to set
	 */
	@Autowired
	public void setDao(PersonMockDao dao)
	{
		this.dao = dao;
	}

//	#####################################################################################################
//	Note: I'm not using any data management (no database connection) because that's a simple
//	example. But, on 'real world' you must use the Transactionals annotations.
//	#####################################################################################################
	
	//@Transactional
	public void deletePerson(Person p)
	{
		dao.deletePerson(p);
	}
	
	//@Transactional(readOnly=true)
	public Person getPerson(Long id){
		return dao.getPerson(id);
	}
	
	//@Transactional(readOnly=true)
	public List<Person> listPersons(){
		return dao.listPersons();
	}
	
	//@Transactional
	public void savePerson(Person p){
		dao.savePerson(p);
	}
	
}
