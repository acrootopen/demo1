package com.acroot.node.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acroot.node.configurations.MasterConfiguration;
import com.acroot.node.entities.MasterEntity;
import com.acroot.node.entities.SlavesEntity;
import com.acroot.node.entities.SwitchesEntity;
import com.acroot.node.models.MasterModel;
import com.acroot.node.models.SlavesModel;
import com.acroot.node.models.SwitchesModel;
import com.acroot.node.repositories.MasterRepository;
import com.acroot.node.repositories.SlavesRepository;
import com.acroot.node.repositories.SwitchesRepository;
import com.acroot.node.responses.SlavesResponse;

@RestController
public class MasterController {

	@Autowired
	public MasterConfiguration masterConfiguration;

	@Autowired
	MasterRepository masterRepo;
	@Autowired
	SlavesRepository slavesRepo;
	@Autowired
	SwitchesRepository switchesRepo;

	@RequestMapping(path = "/hi", method = RequestMethod.POST)
	public Long welcome() {
		return masterConfiguration.getMasterId();
	}

	@RequestMapping(path = "/addSlaves", method = RequestMethod.POST)
	public String addSlaves(@RequestBody SlavesModel slavesModel) {
		SlavesEntity slavesEntity = new SlavesEntity();
		slavesEntity.setMasterId(slavesModel.getMasterId());
		slavesEntity.setSlavesId(slavesModel.getSlavesId());
		slavesEntity.setSlaveHealth(slavesModel.isHealth());
		slavesRepo.save(slavesEntity);
		return "";
	}

	@RequestMapping(path = "/addSwitches", method = RequestMethod.POST)
	public String addSwitches(@RequestBody SwitchesModel switchesModel) {
		SwitchesEntity switchesEntity = new SwitchesEntity();
		switchesEntity.setSwitchesId(switchesModel.getSwitchesId());
		switchesEntity.setSlavesId(switchesModel.getSlavesId());
		switchesEntity.setStatus(switchesModel.isStatus());
		switchesRepo.save(switchesEntity);
		return "";
	}

	@RequestMapping(path = "/getSlaves",method=RequestMethod.GET) public
	 ResponseEntity<List<SlavesResponse>> getSlaves() 
	 {
		int count = (int) slavesRepo.count();
		Page<SlavesEntity> slavesEntities = slavesRepo.findAll(new PageRequest(0, count));
		
		List<SlavesResponse> slavesResponses = new ArrayList<>();
		
		slavesEntities.stream().forEach(slaveEntity -> {
			SlavesResponse slavesResponse = new SlavesResponse();
			slavesResponse.setMasterId(slaveEntity.getMasterId());
			slavesResponse.setHealth(slaveEntity.isSlaveHealth());
			slavesResponse.setSlavesId(slaveEntity.getSlavesId());
			slavesResponses.add(slavesResponse);
		});
		
		return new ResponseEntity<>(slavesResponses, HttpStatus.OK);
	 }

	public String switches() {
		return switchesRepo.toString();
	}

}
