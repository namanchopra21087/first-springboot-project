/**
 * 
 */
package com.home.naman.maven.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author naman
 *
 */
@XmlRootElement
public class Person {
	
	private String name;
	private Integer id;
	private String Country;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}
	
	

}
