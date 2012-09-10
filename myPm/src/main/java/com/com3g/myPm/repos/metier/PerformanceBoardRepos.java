package com.com3g.myPm.repos.metier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com3g.myPm.domaine.PerformanceBoard;

@Repository
public interface PerformanceBoardRepos extends JpaRepository<PerformanceBoard, Long>{

}
