package com.myteam.my_planner_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.optaplanner.core.api.domain.solution.PlanningSolution(autoDiscoverMemberType = org.optaplanner.core.api.domain.autodiscover.AutoDiscoverMemberType.FIELD)
@javax.xml.bind.annotation.XmlRootElement
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class CloudBalancingSolution implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Generated Planner score field")
	@javax.annotation.Generated({"org.optaplanner.workbench.screens.domaineditor.client.widgets.planner.PlannerDataObjectEditor"})
	@org.optaplanner.core.api.domain.solution.PlanningScore
	@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(org.optaplanner.persistence.jaxb.api.score.buildin.hardsoft.HardSoftScoreJaxbXmlAdapter.class)
	private org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score;

	@org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "computers")
	private java.util.List<com.myteam.my_planner_project.Computer> computers;

	private java.util.List<com.myteam.my_planner_project.Process> processes;

	public CloudBalancingSolution() {
	}

	public org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore getScore() {
		return this.score;
	}

	public void setScore(
			org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score) {
		this.score = score;
	}

	public java.util.List<com.myteam.my_planner_project.Computer> getComputers() {
		return this.computers;
	}

	public void setComputers(
			java.util.List<com.myteam.my_planner_project.Computer> computers) {
		this.computers = computers;
	}

	public java.util.List<com.myteam.my_planner_project.Process> getProcesses() {
		return this.processes;
	}

	public void setProcesses(
			java.util.List<com.myteam.my_planner_project.Process> processes) {
		this.processes = processes;
	}

	public CloudBalancingSolution(
			org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score,
			java.util.List<com.myteam.my_planner_project.Computer> computers,
			java.util.List<com.myteam.my_planner_project.Process> processes) {
		this.score = score;
		this.computers = computers;
		this.processes = processes;
	}

}