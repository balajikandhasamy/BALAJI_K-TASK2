package Dto;

import javax.persistence.Entity;
import javax.persistence.Id;





@Entity
public class Operator {
	@Id
	private String Operator_UserName;
	private String operator_name;
	private String Operator_Password;
	public String getOperator_UserName() {
		return Operator_UserName;
	}
	public void setOperator_UserName(String operator_UserName) {
		Operator_UserName = operator_UserName;
	}
	public String getOperator_name() {
		return operator_name;
	}
	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}
	public String getOperator_Password() {
		return Operator_Password;
	}
	public void setOperator_Password(String operator_Password) {
		Operator_Password = operator_Password;
	}
	
}
	
