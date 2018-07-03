package com.community.palteform.community.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the contributor database table.
 * 
 */
@Entity
@NamedQuery(name="Contributor.findAll", query="SELECT c FROM Contributor c")
public class Contributor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contributorId;

	private String name;

	private String type;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="contributor")
	private List<Project> projects;

	//bi-directional many-to-one association to Authority
	@OneToMany(mappedBy="contributor")
	private List<Authority> authorities;

	public Contributor() {
	}

	public int getContributorId() {
		return this.contributorId;
	}

	public void setContributorId(int contributorId) {
		this.contributorId = contributorId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project addProject(Project project) {
		getProjects().add(project);
		project.setContributor(this);

		return project;
	}

	public Project removeProject(Project project) {
		getProjects().remove(project);
		project.setContributor(null);

		return project;
	}

	public List<Authority> getAuthorities() {
		return this.authorities;
	}

	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}

	public Authority addAuthority(Authority authority) {
		getAuthorities().add(authority);
		authority.setContributor(this);

		return authority;
	}

	public Authority removeAuthority(Authority authority) {
		getAuthorities().remove(authority);
		authority.setContributor(null);

		return authority;
	}

}