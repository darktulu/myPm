package com.com3g.myPm.repos.metier;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.com3g.myPm.domaine.PerformanceBoard;
import com.com3g.myPm.domaine.types.SectionMypm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/applicationContext-data.xml",
		"classpath:META-INF/spring/applicationContext-mail.xml",
		"classpath:META-INF/spring/applicationContext-security.xml",
		"classpath:META-INF/spring/applicationContext-aop.xml", "classpath:META-INF/spring/applicationContext.xml" })
public class PerformanceBoardReposTest {

	@Inject
	private PerformanceBoardRepos performanceBoardRepos;

	@Test
	public void test() {
		PerformanceBoard board = new PerformanceBoard();
		
		//Job Execution
		board.setId(1L);
		board.setTitle("JOB KNOWLEDGE / UNDERSTANDING OF SYSTEMS");
		board.setDetails("Degree of knowledge and understanding of position responsibilities; departmental and institutional work procedures, processes and related policies");
		board.setIdCritere(1);
		board.setWeight(20);
		board.setSection(SectionMypm.JOB_EXECUTION);
		
		performanceBoardRepos.save(board);
		
		board.setId(2L);
		board.setTitle("QUALITY OF WORK");
		board.setDetails("Extent to which employee can be counted upon to carry out assignments to completion");
		board.setIdCritere(2);
		board.setWeight(20);
		board.setSection(SectionMypm.JOB_EXECUTION);
		
		performanceBoardRepos.save(board);
		
		board.setId(3L);
		board.setTitle("QUANTITY OF WORK");
		board.setDetails("Volume of work regularly produced, Speed and consistency of output.");
		board.setIdCritere(3);
		board.setWeight(20);
		board.setSection(SectionMypm.JOB_EXECUTION);
		
		performanceBoardRepos.save(board);
		
		board.setId(4L);
		board.setTitle("ANALYTICAL ABILITY");
		board.setDetails("Extend to which employee can analytically review the situation/task and improvise a strategy based on the same");
		board.setIdCritere(4);
		board.setWeight(20);
		board.setSection(SectionMypm.JOB_EXECUTION);
		
		performanceBoardRepos.save(board);
		
		board.setId(5L);
		board.setTitle("THEORETICAL KNOWLEDGE");
		board.setDetails("Extent of job information and understanding");
		board.setIdCritere(5);
		board.setWeight(20);
		board.setSection(SectionMypm.JOB_EXECUTION);
		
		performanceBoardRepos.save(board);
		
		// Code Conduct
		//TODO a completer
		board.setId(6L);
		board.setTitle("ATTENDANCE");
		board.setDetails("Regularity of employee");
		board.setIdCritere(1);
		board.setWeight(20);
		board.setSection(SectionMypm.CODE_CONDUCT);
		
		performanceBoardRepos.save(board);
	}

}
