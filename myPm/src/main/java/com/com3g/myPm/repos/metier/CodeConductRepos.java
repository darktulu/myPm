package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.com3g.myPm.domaine.CodeConduct;


public interface CodeConductRepos  extends JpaRepository<CodeConduct, Long>{
  
	@Query("from CodeConduct where employe =:username")
    public CodeConduct findByemploye (@Param("username") String username);
}
