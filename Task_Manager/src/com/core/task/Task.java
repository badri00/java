package com.core.task;

import java.time.LocalDate;

public class Task {

	private int id;
	private static int count;
	private String name;
	private String description;
	private String status;
	private LocalDate date;
	private boolean active;

	static {
		count = 1;
	}

	public Task(String name, String description, String status, LocalDate date, boolean active) {
		super();
		this.id=count++;
		this.name = name;
		this.description = description;
		this.status = status;
		this.date = date;
		this.active = active;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + ", date="
				+ date + ", active=" + active + "]";
	}

}
