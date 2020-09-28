package com.iiht.coronakit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.coronakit.entity.CoronaKit;

@Repository
public interface CoronaKitRepository extends JpaRepository<CoronaKit, Integer>{

}
