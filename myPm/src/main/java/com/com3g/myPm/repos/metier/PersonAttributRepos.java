package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.PersonAttribut;
import com.com3g.myPm.domaine.PersonAttributId;

public interface PersonAttributRepos  extends JpaRepository<PersonAttribut, PersonAttributId>{
    
}
