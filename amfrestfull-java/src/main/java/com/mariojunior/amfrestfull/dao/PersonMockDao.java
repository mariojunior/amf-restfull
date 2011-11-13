/**
 * 
 */
package com.mariojunior.amfrestfull.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mariojunior.amfrestfull.model.Person;

/**
 * This a simple mock class that abstracts your data management (hibernate, iBatis, JdbcTemplate, whatever...)
 * 
 * @author Mario Junior
 *
 */
@Repository
public class PersonMockDao
{

	static List<Person> dataSet = new ArrayList<Person>();

	//creating a initial persons list
	static {
		for (int i = 0; i < 10; i++)
		{
			Person p = new Person();
			p.setId(new Long(i));
			p.setAge(24+i);
			p.setFirstName("Mario " + i);
			p.setTwitter("@mariojunior");
			p.setIncluded(new Date());
			
			dataSet.add(p);
		}
	}
	
	/**
	 * Returns a list of persons
	 *  
	 * @return
	 */
	public List<Person> listPersons()
	{
		return dataSet;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Person getPerson(Long id)
	{
		Person result = null;
		
		for (Person p : dataSet)
		{
			if (p.getId() == id)
			{
				result = p;
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * Save a person to list
	 * 
	 * @param p
	 */
	public void savePerson(Person p)
	{
		Person person = getPerson(p.getId());
		
		//if there is a person with same id, then edit it
		if (null != person)
		{
			person.setAge(p.getAge());
			person.setFirstName(p.getFirstName());
			person.setTwitter(p.getTwitter());
		} else {
			//if there is not, then adds it on dataset
			dataSet.add(p);
		}
	}

	/**
	 * Delete a person to list
	 * 
	 * @param p
	 */
	public void deletePerson(Person p)
	{
		Person person = getPerson(p.getId());
		
		//if there is a person with same id, then remove it
		if (null != person)
		{
			dataSet.remove(person);
		}
	}
	
}
