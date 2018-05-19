const TICK_INTERVAL = 1000; // tick every second

export default class Timer {
	constructor() {
		this.running = false;
	}

	start () {
		// TODO: update `running` attribute to true
	}

	stop () {
		// TODO: update `running` attribute to false
	}

	tick (callbackFn) {
		// TODO: call callback function if running

		// TODO: schedule another tick call in TICK_INTERVAL based if running
	}
}
