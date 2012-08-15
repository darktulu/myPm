package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.ManagementResponsab;
import com.com3g.myPm.domaine.ManagementResponsabId;

public interface ManagementResponsbRepos  extends JpaRepository<ManagementResponsab, ManagementResponsabId>{
    
}
