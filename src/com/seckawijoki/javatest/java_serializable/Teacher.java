package com.seckawijoki.javatest.java_serializable;

/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class Teacher 
	implements java.io.Serializable
{
	private String name;
	private SerializablePerson student;

	public Teacher(String name , SerializablePerson student)
	{
		this.name = name;
		this.student = student;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	public void setStudent(SerializablePerson student)
	{
		this.student = student;
	}
	public SerializablePerson getStudent()
	{
		 return this.student;
	}

}