/**
 * 
 */
package com.home.naman.maven.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author naman
 *
 */
@XmlRootElement
@Data
public class Person {
	private String name;
	private Integer id;
	private String Country;
}
