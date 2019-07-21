package com.lti.training.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="SUBJECT_TBL")
public class Subject {
	
	@Id
	@Column(name="SID")
	private int sid;
	
	@Column(name="subject_name")
	private String subjectname;
	
	/*@OneToMany(mappedBy = "subject", fetch = FetchType.EAGER)
	private Set<Question> question;
	
	public Set<Question> getQuestion() {
		return question;
	}
	public void setQuestion(Set<Question> question) {
		this.question = question;
	}*/
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

}
