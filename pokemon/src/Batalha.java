
public class Batalha extends Controller {
	
	private class Atacar extends Event{
		public Atacar (long eventTime) {
			super(eventTime);
		}
		public void action(){
		}
		public String description(){
			return ("Efetua um ataque");
		}
	}
	private class UsarItem extends Event{
		public UsarItem (long eventTime) {
			super(eventTime);
		}
		public void action(){
		}
		public String description(){
			return ("Utiliza um Item");
		}
	}
	private class Trocar extends Event{
		public Trocar (long eventTime) {
			super(eventTime);
		}
		public void action(){
		}
		public String description(){
			return ("Troca de Pokemon");
		}
	}
	private class Fugir extends Event{
		public Fugir (long eventTime) {
			super(eventTime);
		}
		public void action(){
		}
		public String description(){
			return ("Foge da batalha");
		}
	}
}
