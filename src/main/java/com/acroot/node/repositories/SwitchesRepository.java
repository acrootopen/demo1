package com.acroot.node.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acroot.node.entities.SwitchesEntity;

@Repository
@Transactional
public interface SwitchesRepository extends JpaRepository<SwitchesEntity, Long>{

}
