// Demonstrate thread groups.
class NewThread extends Thread {
	boolean suspendFlag();

	NewThread(String threadname, ThreadGroup tgOb) {
		super (tgOb, threadname);
		System.out.println("New thread: " + this);
		suspendFlag = false;
	}

	// This is the entry point for thread.
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(getName() + ": " + i);
				Thread.sleep
			}
		}
	}
}