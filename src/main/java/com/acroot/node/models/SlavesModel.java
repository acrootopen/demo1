package com.acroot.node.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlavesModel {
	
	@JsonProperty
	Long SlavesId;
	
	@JsonProperty
	Long MasterId;
	
	@JsonProperty
	boolean Health;

	public Long getSlavesId() {
		return SlavesId;
	}

	public void setSlavesId(Long slavesId) {
		SlavesId = slavesId;
	}

	public Long getMasterId() {
		return MasterId;
	}

	public void setMasterId(Long masterId) {
		MasterId = masterId;
	}

	public boolean isHealth() {
		return Health;
	}

	public void setHealth(boolean health) {
		Health = health;
	}
	
	

}
