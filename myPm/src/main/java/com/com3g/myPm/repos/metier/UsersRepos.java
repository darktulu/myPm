package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;

import com.com3g.myPm.domaine.Users;

public interface UsersRepos  extends JpaRepository<Users, Long>{
    
    public Users findByUsername(String username);
}
