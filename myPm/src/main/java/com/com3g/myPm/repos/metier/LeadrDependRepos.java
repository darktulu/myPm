package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.LeadrDepend;
import com.com3g.myPm.domaine.LeadrDependId;

public interface LeadrDependRepos  extends JpaRepository<LeadrDepend, LeadrDependId>{
    
}
