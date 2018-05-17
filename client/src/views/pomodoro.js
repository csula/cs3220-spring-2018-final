export default class PomodoroComponent extends window.HTMLElement {
	constructor () {
		super();
	}

	connectedCallback () {
		// initial DOM rendering
		this.textContent = 'Pomodoro clock';
	}

	disconnectedCallback () {
	}
};
