package com.lti.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "QUESTION_TBL")
public class Question {
	
	
	@Id
	@GeneratedValue
	private int qid;
	
	private String question;
	private String q_level;

	@ManyToOne
	@JoinColumn(name="SID")
	private Subject subject;

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

	public String getQ_level() {
		return q_level;
	}

	public void setQ_level(String q_level) {
		this.q_level = q_level;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
