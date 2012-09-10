package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.com3g.myPm.domaine.LeadrDepend;


public interface LeadrDependRepos  extends JpaRepository<LeadrDepend, Long>{
	@Query("from LeadrDepend where employe =:username")
	public LeadrDepend findByemploy (@Param ("username ") String username);
    
}
