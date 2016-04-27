abstract public class Event {
	private long evtTime;
	private int prior;
	private boolean problema = false;
	public Event(long eventTime) {
		evtTime = eventTime;
	}
	public boolean ready() {
		return System.currentTimeMillis() >= evtTime;
	}
	public int getPrior(){
		return prior;
	}
	public void deuProblema(){
		problema = true;
	}
	public boolean getProblema(){
		return problema;
	}
	abstract public void action();
	abstract public String description();
}