package com.capg.healthcarecomplete.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.healthcarecomplete.entity.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser,Integer>{

}
