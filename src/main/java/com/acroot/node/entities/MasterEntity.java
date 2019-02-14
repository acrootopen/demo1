package com.acroot.node.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="MasterTable", schema="demo")
public class MasterEntity {

	@Id
	@Column(name="MasterId")
	String masterId;

	public String getMasterId() {
		return masterId;
	}

	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}
	
	
}
