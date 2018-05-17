package edu.csula.cs3220.models;

public class Todo {
	private int id;
	private String description;
	private boolean completed;

	public Todo() {
	}

	public Todo(int id, String description, boolean completed) {
		this.id = id;
		this.description = description;
		this.completed = completed;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		final Todo todo = (Todo) obj;
		return this.id == todo.id &&
			this.description.equals(todo.description) &&
			this.completed == todo.completed;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
}
