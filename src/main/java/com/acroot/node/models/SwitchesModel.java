package com.acroot.node.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SwitchesModel {

	@JsonProperty
	Long SwitchesId;
	
	@JsonProperty
	Long SlavesId;
	
	@JsonProperty
	boolean Status;

	public Long getSwitchesId() {
		return SwitchesId;
	}

	public void setSwitchesId(Long switchesId) {
		SwitchesId = switchesId;
	}

	public Long getSlavesId() {
		return SlavesId;
	}

	public void setSlavesId(Long slavesId) {
		SlavesId = slavesId;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	
	
}
