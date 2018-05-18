# CS 3220 Final

In this final, your task is to create a *TODO list application* with _pomodoro
timer_. If you are not sure what a pomodoro timer is: https://en.wikipedia.org/wiki/Pomodoro_Technique

## Demo

![Demo app](http://g.recordit.co/oNeN0Plavh.gif)

## Get Started

To get started, you will need to start off the assignment from https://classroom.github.com/a/cdsA2dZJ

Once you have cloned the application, you can run the following command to start
off server:

```
gradle appRun
```

And on the front end side of things, you can run the following command under `client` folder after running `npm install`:

```
npm run build
```

## Deliverables

| File name | Points |
| :-- | :-- |
| `TodoDAO.java` | 3 |
| `TodoServlet.java` | 1 |
| `EditTodoServlet.java` | 1 |
| `CompleteTodoServlet.java` | 1 |
| `TodoPomodoroServlet.java` | 1 |
| `pomodoro.js` | 3 |

## Requirements

### Technical

* No HTML code in Java Servlet
* No Java code in JSP
* Use TodoDAO in all Servlets

### Functional

* User should be able to add a todo item
* User should be able to edit a todo item
* User should be able to complete a todo item
* User should be able to start pomodoro timer on a todo item
* User should be able to track how many pomodoro counter for an item

## Hints

It may feel quite overwhelmed looking at all functionalities and files all
together. Here is suggested steps to finish this application:

1. Define `schema.sql`
2. Implement the `TodoDAO.java` and pass its unit test
3. `TodoServlet.java`
	* Render the JSP pages
	* Handle adding a new TODO Item in `doPost`
4. `EditTodoServlet.java`
	* Render the edit page
	* Handle editing the existing item
5. `CompleteTodoServlet.java`
	* Handle completing a todo list item
6. `TodoPomodoroServlet.java`
	* Render the pomodoro page
		- Need to import the `app.bundle.js` script
		- Need to use `pomodoro-timer` _custom element_
	* Handle increment pomodoro counter
7. `pomodoro.js` and pass its unit test

At the end of the implementation, you should have the following urls done:

```
GET /todo -> render index page
POST /todo -> add item
GET  /todo/edit?id=? -> render edit page
POST /todo/edit?id=? -> edit item
POST /todo/complete?id=? -> complete an item
GET /todo/pomodoro?id=? -> render pomodoro clock for an item
POST /todo/pomodoro?id=? -> increment pomodoro counter
```
