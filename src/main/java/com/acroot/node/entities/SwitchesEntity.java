package com.acroot.node.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name = "SwitchesTable", schema = "demo")
public class SwitchesEntity {
	
	@Id
	@Column(name="SwitchesId")
	@PrimaryKeyJoinColumn
	Long switchesId;
	
	@Column(name="SlavesId")
	@PrimaryKeyJoinColumn
	Long slavesId;
	
	@Column(name="Status")
	boolean status;

	public Long getSwitchesId() {
		return switchesId;
	}

	public void setSwitchesId(Long long1) {
		this.switchesId = long1;
	}
	


	public Long getSlavesId() {
		return slavesId;
	}

	public void setSlavesId(Long slavesId) {
		this.slavesId = slavesId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
