package com.sb.beans;

import java.util.Date;
import java.util.List;

public class StudentDetails {
	private List<String> StudentNames;
	private List<Date> ImpDate;
	public void setStudentNames(List<String> studentNames) {
		StudentNames = studentNames;
	}
	public void setImpDate(List<Date> impDate) {
		ImpDate = impDate;
	}
	@Override
	public String toString() {
		return "StudentDetails [StudentNames=" + StudentNames + ", ImpDate=" + ImpDate + "]";
	}
	

}
