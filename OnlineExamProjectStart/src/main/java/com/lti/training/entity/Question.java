package com.lti.training.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "QUESTION_TBL")
public class Question {
	
	
	@Id
	@GeneratedValue
	private int qid;
	
	private String question;
	
	@Column
	private String level;

	@ManyToOne(cascade = CascadeType.ALL)
	private Subject subject;

	@OneToMany(fetch= FetchType.EAGER, mappedBy = "question")
	private Set<Option> option;
	public Set<Option> getOption() {
		return option;
	}

	public void setOption(Set<Option> option) {
		this.option = option;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
