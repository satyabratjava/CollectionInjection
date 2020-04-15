package com.sb.beans;

import java.util.Date;
import java.util.Map;

public class PersonProfile {
	private Map<String,Long> phno;
	private Map<String,Date> impdate;
	private Map<Long,String>bankacc;
	public void setPhno(Map<String, Long> phno) {
		this.phno = phno;
	}
	public void setImpdate(Map<String, Date> impdate) {
		this.impdate = impdate;
	}
	public void setBankacc(Map<Long, String> bankacc) {
		this.bankacc = bankacc;
	}
	@Override
	public String toString() {
		return "PersonProfile [phno=" + phno + ", impdate=" + impdate + ", bankacc=" + bankacc + "]";
	}
	

}
