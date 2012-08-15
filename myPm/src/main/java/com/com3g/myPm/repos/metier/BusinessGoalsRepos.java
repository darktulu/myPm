package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.BusinessGoals;
import com.com3g.myPm.domaine.BusinessGoalsId;

public interface BusinessGoalsRepos  extends JpaRepository<BusinessGoals, BusinessGoalsId>{
    
}
