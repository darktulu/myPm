package com.com3g.myPm.repos.metier;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.com3g.myPm.domaine.Appraisals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:META-INF/spring/applicationContext-data.xml",
	"classpath:META-INF/spring/applicationContext-mail.xml",
	"classpath:META-INF/spring/applicationContext-security.xml",
	"classpath:META-INF/spring/applicationContext-aop.xml",
	"classpath:META-INF/spring/applicationContext.xml" })
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class AppraisalsReposTest {

    @Autowired
    private AppraisalsRepos appraisalsRepos;
    
    @Test
    public void test() {
	Appraisals appraisals = new Appraisals();
	appraisals.setYear(2010);
	appraisals.setEndDate(new Date());
	appraisals.setEndYearSummaryEndDate(new Date());
	appraisals.setEndYearSummaryStartDate(new Date());
	appraisals.setStartDate(new Date());
	appraisals.setMidYearReviewEndDate(new Date());
	appraisals.setMidYearReviewStartDate(new Date());
	appraisals.setPlanningEndDate(new Date());
	appraisals.setPlanningStartDate(new Date());
	appraisals = appraisalsRepos.save(appraisals);
    }

}
