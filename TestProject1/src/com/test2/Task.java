package com.test2;

import java.util.Objects;

public class Task {
	private int taskId;
	private String taskName;
	private int priority;
	public Task(int taskId, String taskName, int priority) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.priority = priority;
	}
	public int getTaskId() {
		return taskId;
		
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return priority == other.priority && taskId == other.taskId && Objects.equals(taskName, other.taskName);
	}
	
	public String toString() {
		return "Task taskId=" + taskId + ", taskName=" + taskName + ", priority=" + priority ;
	}

}
