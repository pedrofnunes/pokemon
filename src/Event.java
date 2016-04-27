abstract public class Event {
	private long evtTime;
	private int prior;
	public Event(long eventTime) {
		evtTime = eventTime;
	}
	public boolean ready() {
		return System.currentTimeMillis() >= evtTime;
	}
	public int getPrior(){
		return prior;
	}
	abstract public void action();
	abstract public String description();
}