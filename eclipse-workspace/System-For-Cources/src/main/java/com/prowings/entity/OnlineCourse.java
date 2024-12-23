package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("OnCourse ")
public class OnlineCourse extends Course {

	@Column
	private String platform;
	@Column
	private int accessDuration;

	public OnlineCourse() {
		super();
	}

	public OnlineCourse(String courseName, int duration, long fees, String platform, int accessDuration) {
		super(courseName, duration, fees);
		this.platform = platform;
        this.accessDuration = accessDuration;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public int getAccessDuration() {
		return accessDuration;
	}

	public void setAccessDuration(int accessDuration) {
		this.accessDuration = accessDuration;
	}

	@Override
	public String toString() {
		return "OnlineCourse [platform=" + platform + ", accessDuration=" + accessDuration + "]";
	}

}
