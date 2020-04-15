package com.sb.beans;

import java.util.Arrays;
import java.util.Date;

public class Student {

	private int [] marks;
	private Date []impDate;
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setImpDate(Date[] impDate) {
		this.impDate = impDate;
	}
	private Student() {
		System.out.println("Student:0-param constructor");
	}
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", impDate=" + Arrays.toString(impDate) + "]";
	}
	
	
}
