package com.capg.healthcarecomplete.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.healthcarecomplete.entity.Center;


@Repository("centerRepository")
public interface CenterRepository extends JpaRepository<Center,Integer> {

}
