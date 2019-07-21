package com.lti.training.entity;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name="OPTIONS_TBL")
	public class Option {
		
		@Id
		@GeneratedValue
		private int oid;
		private String options;
		private int flag;
		
		@ManyToOne
		@JoinColumn(name="QID")
		private Question question;

		public int getOid() {
			return oid;
		}

		public void setOid(int oid) {
			this.oid = oid;
		}

		public String getOptions() {
			return options;
		}

		public void setOptions(String options) {
			this.options = options;
		}

		public int getFlag() {
			return flag;
		}

		public void setFlag(int flag) {
			this.flag = flag;
		}

		public Question getQuestion() {
			return question;
		}

		public void setQuestion(Question question) {
			this.question = question;
		}
}
