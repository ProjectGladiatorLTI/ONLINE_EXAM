package com.lti.training.entity;

	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;

	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="TBL_REG")
	public class Student {
			
		private String name;
		@Id
		private String email;
		private long mobile;
		private String city;
		private String state;
		private Date dob;
		private String qualification;
		@Column(name="YEAR_OF_COMPLITION")
		private int yearofcompletion;
		private String password;
		
		@Override
		public String toString() {
				return "RegisterEntity [name=" + name + ", email=" + email + ", mobile=" + mobile + ", city=" + city
						+ ", state=" + state + ", dob=" + dob + ", qualification=" + qualification + ", yearofcompletion="
						+ yearofcompletion + ", password=" + password + ", getName()=" + getName() + ", getEmail()="
						+ getEmail() + ", getMobile()=" + getMobile() + ", getCity()=" + getCity() + ", getState()="
						+ getState() + ", getDob()=" + getDob() + ", getQualification()=" + getQualification()
						+ ", getYearofcompletion()=" + getYearofcompletion() + ", getPassword()=" + getPassword()
						+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
						+ "]";
			}
			
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobile() {
			return mobile;
	}
		public void setMobile(long mobile) {
				this.mobile = mobile;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public String getState() {
				return state;
			}
			public void setState(String state) {
				this.state = state;
			}
			public Date getDob() {
				return dob;
			}
			public void setDob(Date dob) {
				this.dob = dob;
			}
			public String getQualification() {
				return qualification;
			}
			public void setQualification(String qualification) {
				this.qualification = qualification;
			}
			public int getYearofcompletion() {
				return yearofcompletion;
			}
			public void setYearofcompletion(int yearofcompletion) {
				this.yearofcompletion = yearofcompletion;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
			
}
