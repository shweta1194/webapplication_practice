package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("OffCourse")
public class OfflineCourse extends Course {

	@Column
	private String location;
	@Column
	private int batchSize;

	public OfflineCourse() {
		super();
	}

	public OfflineCourse(String courseName, int duration, long fees, String location, int batchSize) {
		super(courseName, duration, fees);
		this.location = location;
        this.batchSize = batchSize;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	@Override
	public String toString() {
		return "OfflineCourse [location=" + location + ", batchSize=" + batchSize + "]";
	}

}
