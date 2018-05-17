import '@webcomponents/webcomponentsjs';

import ExampleComponent from './views/example';
import PomodoroComponent from './views/pomodoro';

main();

// main function wraps everything at top level
function main () {
	// define web components
	window.customElements.define('component-example', ExampleComponent);
	window.customElements.define('pomodoro-clock', PomodoroComponent);
}
