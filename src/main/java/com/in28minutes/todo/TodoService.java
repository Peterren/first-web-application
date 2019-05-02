package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Web Application","study"));
		todos.add(new Todo("Learn Spring MVC","study"));
		todos.add(new Todo("Learn Spring rest","study"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
	public void addTodo(Todo newTodo) {
		todos.add(newTodo);
	}
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}