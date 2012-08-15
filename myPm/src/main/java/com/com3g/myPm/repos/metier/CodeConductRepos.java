package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.CodeConduct;
import com.com3g.myPm.domaine.CodeConductId;

public interface CodeConductRepos  extends JpaRepository<CodeConduct, CodeConductId>{
    
}
