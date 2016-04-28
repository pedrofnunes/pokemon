
public class Batalha extends Controller {
	private class Atacar extends Event{
		private int prior = 3;//ou 4 ou 5, dependendo da velocidade do ataque.
		private Ataque at;
		private Treinador src;
		private Treinador target;
		public Atacar (long eventTime, int i, Treinador src, Treinador target) {
			super(eventTime);
			this.at = src.getAtivo().getAtaque(i);
			this.src = src;
			this.target = target;
			this.prior = this.prior + at.getPrior();
		}
		public void action(){
			at.usar(target.getAtivo());
			System.out.println(src.getAtivo().getNome()+" usou "+at.getNome()+"! "+at.getDano()+" de dano.");
			if (target.getAtivo().getEstado() == false){
				System.out.println(target.getAtivo().getNome()+" desmaiou!");
				target.pokeMorreu();
				if (target.perdeu() == true){
					this.deuProblema();
					System.out.println(target.getNome()+" não tem mais Pokémons aptos! "+src.getNome()+" é o vencedor!");
					finaliza();
				}
				else{
					target.trocaPoke(target.proxVivo());
					this.deuProblema();
					System.out.println(target.getNome()+": "+target.getAtivo().getNome()+", escolho você!");
				}
			}
		}
	}
	private class UsarItem extends Event{
		private int prior = 2;
		private Item item;
		private Pokemon p;
		public UsarItem (long eventTime, Item item, Pokemon p) {
			super(eventTime);
			this.item = item;
			this.p = p;
		}
		public void action(){
			item.usaItem(p);
			System.out.println(item.getNome()+" usado em "+p.getNome()+". Novo HP = "+p.getHP());
		}
	}
	private class Trocar extends Event{
		private int prior = 1;
		private Treinador t;
		private int i;
		public Trocar (long eventTime, Treinador t, int i) {
			super(eventTime);
			this.t = t;
			this.i = i;
		}
		public void action(){
			System.out.println(t.getNome()+": "+t.getAtivo().getNome()+", chega!");
			t.trocaPoke(i);
			System.out.println(t.getNome()+": Vai, "+t.getAtivo().getNome()+"!");
		}
	}
	private class Fugir extends Event{
		private int prior = 0;
		private Treinador fugiu, ganhou;
		public Fugir (long eventTime, Treinador fugiu, Treinador ganhou) {
			super(eventTime);
			this.fugiu = fugiu;
			this.ganhou = ganhou;
		}
		public void action(){
			this.deuProblema();
			System.out.println(fugiu.getNome()+" fugiu. "+ganhou.getNome()+" é o vencedor!");
			finaliza();
		}
	}
	public static void main(String[] args){
		
	}
}
