package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Entity // specifys that cls is an entity and mapped to relational database table
@Table(name="contact_master")
@Component
public class ContactMaster {
	@Id
	@Column(name="contact_id")
	private int contract_id;
	@Column(name="contact_name")
	private String contact_nm;
	public int getContract_id() {
		return contract_id;
	}
	public void setContract_id(int contract_id) {
		this.contract_id = contract_id;
	}
	public String getContact_nm() {
		return contact_nm;
	}
	public void setContact_nm(String contact_nm) {
		this.contact_nm = contact_nm;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	@Column(name="contact_number")
	private long contact_number;
	@Override
	public String toString() {
		return "ContactMaster [contract_id=" + contract_id + ", contact_nm=" + contact_nm + ", contact_number="
				+ contact_number + "]";
	}

	
}
