/*
 * RoleVO.java
 */
package com.spring.saas.model;

/**
 * This class holds roles details.
 *
 * @author yaror2
 */
public class RoleVO {

	/** The id. */
	private Long id;

	/** The name. */
	private String name;

	/** The description. */
	private String description;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param roleName the new name
	 */
	public void setName(String roleName) {
		this.name = roleName;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
