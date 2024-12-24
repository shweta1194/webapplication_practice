package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
//@DiscriminatorColumn(name = "mode", discriminatorType = DiscriminatorType.STRING)
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String courseName;
	@Column
	private int duration;
	@Column
	private long fees;

	public Course() {
		super();
	}

	public Course(int id, String courseName, int duration, long fees) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}

	public Course(String courseName, int duration, long fees) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", duration=" + duration + ", fees=" + fees + "]";
	}

}
