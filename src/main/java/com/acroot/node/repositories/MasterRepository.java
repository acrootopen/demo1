package com.acroot.node.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acroot.node.entities.MasterEntity;

@Repository
@Transactional
public interface MasterRepository extends JpaRepository<MasterEntity, Long>{

}
