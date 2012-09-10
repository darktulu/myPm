package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.com3g.myPm.domaine.PersonAttribut;


public interface PersonAttributRepos  extends JpaRepository<PersonAttribut, Long>{
    @Query("from PersonAttribut where employe =:username")
    public PersonAttribut findByemploye (@Param("username") String username );
}
