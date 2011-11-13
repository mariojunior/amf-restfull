/**
 * 
 */
package com.mariojunior.amfrestfull.model;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonAutoDetect;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author Mario Junior
 *
 */
@XStreamAlias("person")
@JsonAutoDetect
public class Person implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String firstName;
	private String twitter;
	private Integer age;
	private Date included;
	
	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id)
	{
		this.id = id;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * @return the twitter
	 */
	public String getTwitter()
	{
		return twitter;
	}
	/**
	 * @param twitter the twitter to set
	 */
	public void setTwitter(String twitter)
	{
		this.twitter = twitter;
	}
	/**
	 * @return the age
	 */
	public Integer getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age)
	{
		this.age = age;
	}
	/**
	 * @param included the included to set
	 */
	public void setIncluded(Date included)
	{
		this.included = included;
	}
	/**
	 * @return the included
	 */
	public Date getIncluded()
	{
		return included;
	}
	

}
