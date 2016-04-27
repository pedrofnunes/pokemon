class EventSet {
	private	Event[] events = new Event[100];
	private	int index = 0;
	private	int next = 0;
	public void add(Event e) {
		if (index >= events.length)
			return;
		events[index++] = e;
	}
	public Event getNext() {
		boolean looped = false;
		int start = next;
		do {
			next = (next + 1) % events.length;
		if (start == next) 
			looped = true;
		if ((next == (start + 1) % events.length) && looped)
			return null;
		}
		while (events[next] == null);
			return events[next];
		}
		public void removeCurrent() {
			events[next] =	 null;
		}
}

public class Controller {
	private EventSet es = new EventSet();
	public void addEvent(Event c) {
		es.add(c);
	}
	public void run() {
		Event e, f;
		while(es.getNext() != null) {
			e = es.getNext();
			es.removeCurrent();
			if(es.getNext() != null){
				f = es.getNext();
				es.removeCurrent();
			}
			if (e.getPrior() >= f.getPrior()) {
				if(e.ready()){
					e.action();
					System.out.println(e.description());
				}
				//aqui ele tem que ver se morreu o pokemon. se ele morrer AQUI, o proximo evento nao rola, pq seria o ataque dele
				if(f.ready()){
					f.action();
					System.out.println(f.description());
				}
			}
			else{
				if(f.ready()){
					f.action();
					System.out.println(f.description());
				}
				//aqui tb
				if(e.ready()){
					e.action();
					System.out.println(e.description());
			}
		}
	}
}