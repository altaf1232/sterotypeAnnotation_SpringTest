package com.springcores;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//here is declear @Compnent this annotation used then not used <bean>
 @Component //("ob")
public class Student 
{
  //if your properties do not give value then you used to @value Annotion
    @Value("Altaf Malik")
   private String studentName;
    @Value("Mumbai Sakinaka")
   private String city;
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + "]";
}
   

}
