package com.community.palteform.community.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the authority database table.
 * 
 */
@Entity
@NamedQuery(name="Authority.findAll", query="SELECT a FROM Authority a")
public class Authority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int authorityid;

	//bi-directional many-to-one association to Contributor
	@ManyToOne
	@JoinColumn(name="conId")
	private Contributor contributor;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="proId")
	private Project project;

	public Authority() {
	}

	public int getAuthorityid() {
		return this.authorityid;
	}

	public void setAuthorityid(int authorityid) {
		this.authorityid = authorityid;
	}

	public Contributor getContributor() {
		return this.contributor;
	}

	public void setContributor(Contributor contributor) {
		this.contributor = contributor;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}