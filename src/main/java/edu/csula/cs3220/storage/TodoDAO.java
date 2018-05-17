package edu.csula.cs3220.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import edu.csula.cs3220.models.Todo;

public class TodoDAO {
	private Database context;

	protected static final String getAllQuery = "";
	protected static final String getByIdQuery = "";
	protected static final String addQuery = "";
	protected static final String setQuery = "";
	protected static final String removeQuery = "";

	public TodoDAO(Database context) {
		this.context = context;
	}

	public List<Todo> getAll() {
		// TODO: retrieve a list of todo items
		return new ArrayList<>();
	}

	public Optional<Todo> getById(int id) {
		// TODO: getting a specific todo item by id
		return Optional.empty();
	}

	public void add(Todo item) {
		// TODO: add a new todo list item
	}

	public void set(int id, Todo item) {
		// TODO: update specific todo item by id
	}

	public void remove(int id) {
		// TODO: remove a specific todo item by id
	}
}
