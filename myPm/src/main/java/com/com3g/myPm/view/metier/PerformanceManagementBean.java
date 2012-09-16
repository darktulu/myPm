package com.com3g.myPm.view.metier;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.com3g.myPm.domaine.Evaluation;
import com.com3g.myPm.domaine.PerformanceBoard;
import com.com3g.myPm.domaine.PerformanceManagement;
import com.com3g.myPm.domaine.types.SectionMypm;
import com.com3g.myPm.i18n.I18nMessageBean;
import com.com3g.myPm.service.exception.SectionAlreadyChosenException;
import com.com3g.myPm.service.metier.PerformanceBoardService;
import com.com3g.myPm.service.metier.PerformanceManagementService;
import com.com3g.myPm.view.utils.SessionBean;
import com.com3g.myPm.view.utils.UserSessionBean;

@ManagedBean(name = "performanceManagementBean")
@RequestScoped
public class PerformanceManagementBean {

	@ManagedProperty(value = "#{userSessionBean}")
	private UserSessionBean userSessionBean;

	@ManagedProperty(value = "#{sessionBean}")
	private SessionBean sessionBean;

	@ManagedProperty(value = "#{performanceBoardService}")
	private PerformanceBoardService performanceBoardService;

	@ManagedProperty(value = "#{performanceManagementService}")
	private PerformanceManagementService performanceManagementService;

	@ManagedProperty(value = "#{i18nMessageBean}")
	private I18nMessageBean i18nMessageBean;

	private List<PerformanceBoard> performanceBoards;
	private PerformanceManagement performanceManagement;
	private PerformanceBoard performanceBoard = new PerformanceBoard();
	private List<Evaluation> evaluations;

	private List<com.com3g.myPm.domaine.SectionMypm> selectedSections = new ArrayList<com.com3g.myPm.domaine.SectionMypm>();

	private SectionMypm section;

	public void saveChoice() {
		try {
			performanceManagementService.saveChoice(section, userSessionBean.getUsername());
		} catch (SectionAlreadyChosenException e) {
			i18nMessageBean.showErrorMessage("section.already.added");
		}
	}

	public UserSessionBean getUserSessionBean() {
		return userSessionBean;
	}

	public void setUserSessionBean(UserSessionBean userSessionBean) {
		this.userSessionBean = userSessionBean;
	}

	public List<PerformanceBoard> getPerformanceBoards() {
		performanceBoards = performanceBoardService.findAll();
		return performanceBoards;
	}

	public void setPerformanceBoards(List<PerformanceBoard> performanceBoards) {
		this.performanceBoards = performanceBoards;
	}

	public PerformanceBoard getPerformanceBoard() {
		return performanceBoard;
	}

	public void setPerformanceBoard(PerformanceBoard performanceBoard) {
		this.performanceBoard = performanceBoard;
	}

	public PerformanceBoardService getPerformanceBoardService() {
		return performanceBoardService;
	}

	public void setPerformanceBoardService(PerformanceBoardService performanceBoardService) {
		this.performanceBoardService = performanceBoardService;
	}

	public PerformanceManagementService getPerformanceManagementService() {
		return performanceManagementService;
	}

	public void setPerformanceManagementService(PerformanceManagementService performanceManagementService) {
		this.performanceManagementService = performanceManagementService;
	}

	public I18nMessageBean getI18nMessageBean() {
		return i18nMessageBean;
	}

	public void setI18nMessageBean(I18nMessageBean i18nMessageBean) {
		this.i18nMessageBean = i18nMessageBean;
	}

	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public SectionMypm getSection() {
		return section;
	}

	public void setSection(SectionMypm section) {
		this.section = section;
	}

	public PerformanceManagement getPerformanceManagement() {
		performanceManagement = performanceManagementService.loadPerformanceMgmtByUsername(userSessionBean
				.getSelectedUsername());
		return performanceManagement;
	}

	public void setPerformanceManagement(PerformanceManagement performanceManagement) {
		this.performanceManagement = performanceManagement;
	}

	public List<com.com3g.myPm.domaine.SectionMypm> getSelectedSections() {
		performanceManagement = performanceManagementService.loadPerformanceMgmtByUsername(userSessionBean
				.getSelectedUsername());
		if (performanceManagement.getSections() != null)
			selectedSections = performanceManagement.getSections();
		return selectedSections;
	}

	public void setSelectedSections(List<com.com3g.myPm.domaine.SectionMypm> selectedSections) {
		this.selectedSections = selectedSections;
	}

	public void loadEvaluation() {
		performanceManagementService.loadEvaluations(userSessionBean.getSelectedUsername());
		evaluations = performanceManagementService.loadEvaluations(userSessionBean.getSelectedUsername(),
				sessionBean.getSelectedSection());
		sessionBean.setSelectedListEval(evaluations);
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public void saveEvaluations() {
		performanceManagementService.saveEvaluations(sessionBean.getSelectedListEval());
		i18nMessageBean.showInfoMessage("evaluation.added.succes"); 
	}

}
