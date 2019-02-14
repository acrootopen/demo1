package com.acroot.node.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MasterModel {
	
	@JsonProperty
	Iterable<Long> MasterId;

	public Iterable<Long> getMasterId() {
		return MasterId;
	}

	public void setMasterId(Iterable<Long> masterId) {
		MasterId = masterId;
	}
	

}
