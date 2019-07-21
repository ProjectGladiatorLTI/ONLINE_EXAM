package com.lti.training.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="REPORT_TBL")
public class Report {
	
	@Id
	@GeneratedValue
	private int id;
	private int level1;
	private int level2;
	private int level3;
	private int total;

	@ManyToOne
	@JoinColumn(name="email")
	private Student student;
	
	//@ManyToMany
	//@JoinColumn(name="SID")
	//private Subject subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getLevel1() {
		return level1;
	}
	public void setLevel1(int level1) {
		this.level1 = level1;
	}
	public int getLevel2() {
		return level2;
	}
	public void setLevel2(int level2) {
		this.level2 = level2;
	}
	public int getLevel3() {
		return level3;
	}
	public void setLevel3(int level3) {
		this.level3 = level3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

	
}
