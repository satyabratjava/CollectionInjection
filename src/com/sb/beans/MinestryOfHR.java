package com.sb.beans;

import java.util.Date;
import java.util.List;

public class MinestryOfHR {
	private List<Long> AdharNumber;
	private List<Date> ImpDate;
	public void setAdharNumber(List<Long> adharNumber) {
		AdharNumber = adharNumber;
	}
	public void setImpDate(List<Date> impDate) {
		ImpDate = impDate;
	}
	@Override
	public String toString() {
		return "MinestryOfHR [AdharNumber=" + AdharNumber + ", ImpDate=" + ImpDate + "]";
	}
	

}
