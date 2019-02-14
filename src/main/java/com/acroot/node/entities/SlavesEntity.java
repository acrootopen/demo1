package com.acroot.node.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="SlavesTable", schema="demo")
public class SlavesEntity {
	
	@Id
	@Column(name="SlavesId")
	Long slavesId;

	@Column(name="MasterId")
	@PrimaryKeyJoinColumn
	Long masterId;
	
	@Column(name="SlaveHealth")
	boolean slaveHealth;

	public Long getSlavesId() {
		return slavesId;
	}

	public void setSlavesId(Long slavesId) {
		this.slavesId = slavesId;
	}

	public Long getMasterId() {
		return masterId;
	}

	public void setMasterId(Long masterId) {
		this.masterId = masterId;
	}

	public boolean isSlaveHealth() {
		return slaveHealth;
	}

	public void setSlaveHealth(boolean slaveHealth) {
		this.slaveHealth = slaveHealth;
	}
	
	

	

}
