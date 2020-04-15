package com.sb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sb.beans.MinestryOfHR;
import com.sb.beans.PersonProfile;
import com.sb.beans.Student;
import com.sb.beans.StudentDetails;

public class StudentTest {
public static void main(String[] args) {
	StudentDetails d=null;
	PersonProfile p=null;
	MinestryOfHR hr=null;
	Resource res=null;
	BeanFactory f=null;
	Student s=null;
	res=new FileSystemResource("src\\com\\sb\\cnfg\\ApplicationContext.xmml.xml");
	f=new XmlBeanFactory(res);
	s=f.getBean("st",Student.class);
	System.out.println("..........................................................................................................................................................");
	System.out.println(s);
	System.out.println("..........................................................................................................................................................");
	d=f.getBean("clgDetails",StudentDetails.class);
	System.out.println(d);
	System.out.println("..........................................................................................................................................................");
	hr=f.getBean("hrs",MinestryOfHR.class);
	System.out.println(hr);
	System.out.println("..........................................................................................................................................................");
	p=f.getBean("pp",PersonProfile.class);
	System.out.println(p);
	System.out.println("..........................................................................................................................................................");

}
}
