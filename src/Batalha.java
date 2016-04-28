
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
	private class Restart extends Event{
		public Restart(long eventTime) {
			super(eventTime);
		}
		Ataque bite = new Ataque ("Bite", 60, 1);
		Ataque bodySlam = new Ataque ("Body Slam", 85, 1);
		Ataque confusion = new Ataque ("Confusion", 60, 1);
		Ataque dragonbreath = new Ataque ("Dragonbreath", 80, 1);
		Ataque earthquake = new Ataque ("Earthquake", 100, 1);
		Ataque fireBlast = new Ataque ("Fire Blast", 150, 2);
		Ataque flamethrower = new Ataque ("Flamethrower", 90, 1);
		Ataque fly = new Ataque ("Fly", 70, 1);
		Ataque headbutt = new Ataque ("Headbutt", 65, 1);
		Ataque hyperBeam = new Ataque ("Hyper Beam", 150, 2);
		Ataque iceBeam = new Ataque ("Ice Beam", 90, 1);
		Ataque leafBlade = new Ataque ("Leaf Blade", 80, 1);
		Ataque megaPunch = new Ataque ("Mega Punch", 70, 1);
		Ataque megaKick = new Ataque ("Mega Kick", 100, 1);
		Ataque metalClaw = new Ataque ("Metal Claw", 70, 1);
		Ataque psychic = new Ataque ("Psychic", 90, 1);
		Ataque pursuit = new Ataque ("Pursuit", 40, 0);
		Ataque quickAttack = new Ataque ("Quick Attack", 40, 0);
		Ataque razorLeaf = new Ataque ("Razor Leaf", 60, 1);
		Ataque rockSlide = new Ataque ("Rock Slide", 60, 1);
		Ataque seismicToss = new Ataque ("Seismic Toss", 100, 1);
		Ataque shadowBall = new Ataque ("Shadow Ball", 80, 1);
		Ataque sludge = new Ataque ("Sludge", 60, 1);
		Ataque solarbeam = new Ataque ("Solarbeam", 150, 2);
		Ataque spark = new Ataque ("Spark", 50, 0);
		Ataque surf = new Ataque ("Surf", 95, 1);
		Ataque tackle = new Ataque ("Tackle", 40, 1);
		Ataque thunderbolt = new Ataque ("Thunderbolt", 95, 1);
		Ataque thundershock = new Ataque ("Thundershock", 40, 1);
		Ataque waterGun = new Ataque ("Water Gun", 40, 0);
		Ataque zapCannon = new Ataque ("Zap Cannon", 150, 2);

		Pokemon pikachu = new Pokemon ("Pikachu", 150, zapCannon, thunderbolt, spark, quickAttack);
		Pokemon charizard = new Pokemon ("Charizard", 300, fireBlast, flamethrower, fly, metalClaw);
		Pokemon chansey = new Pokemon ("Chansey", 650, thundershock, tackle, pursuit, waterGun);
		Pokemon alakazan = new Pokemon ("Alakazan", 350, psychic, shadowBall, confusion, pursuit);
		Pokemon blastoise = new Pokemon ("Blastoise", 300, surf, waterGun, iceBeam, earthquake);
		Pokemon snorlax = new Pokemon ("Snorlax", 450, bodySlam, earthquake, hyperBeam, headbutt);

		Pokemon sceptile = new Pokemon ("Sceptile", 300, solarbeam, sludge, razorLeaf, leafBlade);
		Pokemon gardevoir = new Pokemon ("Gardevoir", 350, thunderbolt, psychic, flamethrower, confusion);
		Pokemon tyranitar = new Pokemon ("Tyranitar", 450, rockSlide, earthquake, dragonbreath, seismicToss);
		Pokemon octilery = new Pokemon ("Octilery", 250, surf, zapCannon, iceBeam, hyperBeam);
		Pokemon hitmontop = new Pokemon ("Hitmontop", 200, megaPunch, megaKick, seismicToss, earthquake);
		Pokemon houndoom = new Pokemon ("Houndoom", 300, fireBlast, bite, quickAttack, flamethrower);
		
		Treinador red = new Treinador ("Red", pikachu, charizard, chansey, alakazan, blastoise, snorlax);
		Treinador silver = new Treinador ("Silver", sceptile, gardevoir, tyranitar, octilery, hitmontop, houndoom);

		public void action(){
			long tm = System.currentTimeMillis();
			addEvent(new Atacar(tm, 0, red, silver));
			addEvent(new Atacar(tm + 500, 0, silver, red));
			addEvent(new Atacar(tm + 1000, 1, red, silver));
			addEvent(new Atacar(tm + 1500, 1, silver, red));
			addEvent(new Atacar(tm + 2000, 2, red, silver));
			addEvent(new Atacar(tm + 2500, 2, silver, red));
			addEvent(new Atacar(tm + 3000, 3, red, silver));
			addEvent(new Atacar(tm + 3500, 3, silver, red));
			addEvent(new Atacar(tm + 4000, 2, red, silver));
			addEvent(new Atacar(tm + 4500, 3, silver, red));
			addEvent(new Atacar(tm + 5000, 0, red, silver));
			addEvent(new Atacar(tm + 5500, 0, silver, red));
			addEvent(new Atacar(tm + 6000, 1, red, silver));
			addEvent(new Atacar(tm + 6500, 1, silver, red));
			addEvent(new Atacar(tm + 7000, 2, red, silver));
			addEvent(new Atacar(tm + 7500, 2, silver, red));
			addEvent(new Atacar(tm + 8000, 3, red, silver));
			addEvent(new Atacar(tm + 8500, 3, silver, red));
			addEvent(new Atacar(tm + 9000, 1, red, silver));
			addEvent(new Atacar(tm + 9500, 2, silver, red));
			addEvent(new Atacar(tm + 10000, 0, red, silver));
			addEvent(new Atacar(tm + 10500, 0, silver, red));
			addEvent(new Atacar(tm + 11000, 1, red, silver));
			addEvent(new Atacar(tm + 11500, 1, silver, red));
			addEvent(new Atacar(tm + 12000, 1, red, silver));
		}

	}
	public static void main(String[] args){
		
	}
}
