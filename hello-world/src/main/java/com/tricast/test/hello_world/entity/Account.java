package com.tricast.test.hello_world.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * Hibernate test class
 *
 */
@Entity
@Table(appliesTo = "ACCOUNTS")
public class Account {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="username")
    private String username;
	
	@Column(name="createdBy")
    private String createdBy;
	
	@Column(name="createdDate")
    private Date createdDate;
    
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + "]";
	}

}
