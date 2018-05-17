import '@webcomponents/webcomponentsjs';

import ExampleComponent from './views/example';

main();

// main function wraps everything at top level
function main () {
	// define web components
	window.customElements.define('component-example', ExampleComponent);
}
