package com.ln.spring.sysmanage.entity;

/**
 * 学生实体类
 * @author Administrator
 *
 */
public class Student implements java.io.Serializable{

	private static final long serialVersionUID = -3875695558042397898L;
	
	private Integer id;
	private String name;
	private Integer age;
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}		 
}
