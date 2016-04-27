
public class Batalha extends Controller {
	public Batalha (Treinador t1, Treinador t2){
		
	}
	Ataque bite = new Ataque (Bite, 60, 1);
	Ataque bodySlam = new Ataque (Body Slam, 85, 1);
	Ataque confusion = new Ataque (Confusion, 60, 1);
	Ataque dragonbreath = new Ataque (Dragonbreath, 80, 1);
	Ataque earthquake = new Ataque (Earthquake, 100, 1);
	Ataque fireBlast = new Ataque (Fire Blast, 150, 2);
	Ataque flamethrower = new Ataque (Flamethrower, 90, 1);
	Ataque fly = new Ataque (Fly, 70, 1);
	Ataque headbutt = new Ataque (Headbutt, 65, 1);
	Ataque hyperBeam = new Ataque (Hyper Beam, 150, 2);
	Ataque iceBeam = new Ataque (Ice Beam, 90, 1);
	Ataque leafBlade = new Ataque (Leaf Blade, 80, 1);
	Ataque megaPunch = new Ataque (Mega Punch, 70, 1);
	Ataque megaKick = new Ataque (Mega Kick , 100, 1);
	Ataque metalClaw = new Ataque (Metal Claw, 70, 1);
	Ataque psychic = new Ataque (Psychic, 90, 1);
	Ataque pursuit = new Ataque (Pursuit, 40, 0);
	Ataque quickAttack = new Ataque (Quick Attack, 40, 0);
	Ataque razorLeaf = new Ataque (Razor Leaf, 60, 1);
	Ataque rockSlide = new Ataque (Rock Slide, 60, 1);
	Ataque seismicToss = new Ataque (Seismic Toss, 100, 1);
	Ataque shadowBall = new Ataque (Shadow Ball, 80, 1);
	Ataque sludge = new Ataque (Sludge, 60, 1);
	Ataque solarbeam = new Ataque (Solarbeam, 150, 2);
	Ataque spark = new Ataque (Spark, 50, 0);
	Ataque surf = new Ataque (Surf, 95, 1);
	Ataque tackle = new Ataque (Tackle, 40, 1);
	Ataque thunderbolt = new Ataque (Thunderbolt, 95, 1);
	Ataque thundershock = new Ataque (Thundershock, 40, 1);
	Ataque waterGun = new Ataque (Water Gun, 40, 0);
	Ataque zapCannon = new Ataque (Zap Cannon, 150, 2);

	Pokemon pikachu = new Pokemon (Pikachu, 150, zapCannon, thunderbolt, spark, quickAttack);
	Pokemon charizard = new Pokemon (Charizard, 300, fireBlast, flamethrower, fly, metalClaw);
	Pokemon chansey = new Pokemon (Chansey, 650, thundershock, tackle, pursuit, waterGun);
	Pokemon alakazan = new Pokemon (Alakazan, 350, psychic, shadowBall, confusion, pursuit);
	Pokemon blastoise = new Pokemon (Blastoise, 300, surf, waterGun, iceBeam, earthquake);
	Pokemon snorlax = new Pokemon (Snorlax, 450, bodySlam, earthquake, hyperBeam, headbutt);

	Pokemon sceptile = new Pokemon (Sceptile, 300, solarbeam, sludge, razorLeaf, leafBlade);
	Pokemon gardevoir = new Pokemon (Gardevoir, 350, thunderbolt, psychic, flamethrower, confusion);
	Pokemon tyranitar = new Pokemon (Tyranitar, 450, rockSlide, earthquake, dragonbreath, seismicToss);
	Pokemon octilery = new Pokemon (Octilery, 250, surf, zapCannon, iceBeam, hyperBeam);
	Pokemon hitmontop = new Pokemon (Hitmontop, 200, megaPunch, megaKick, seismicToss, earthquake);
	Pokemon houndoom = new Pokemon (Houndoom, 300, fireBlast, bite, quickAttack, flamethrower);
	
	Treinador red = new Treinador (Red, pikachu, charizard, chansey, alakazan, blastoise, snorlax);
	Treinador silver = new Treinador (Silver, sceptile, gardevoir, tyranitar, octilery, hitmontop, houndoom);
	
	private class Atacar extends Event{
		private int prior = 3;//ou 4 ou 5, dependendo da velocidade do ataque.
		public Atacar (long eventTime, Ataque at, Treinador src, Treinador target) {
			super(eventTime);
			this.prior = this.prior + at.prior;
		}
		public void action(){
			at.usar(target.getAtivo());
			//rola o ataque
			//ve se o pokemon morreu
			//se nao morreu, bola
			//se morreu, deleta/marca o evento seguinte 
			//ve se o treinador ainda tem pokemons aptos
			//se tiver, pega o mais facil e troca
			//se nao tiver, aciona o final (ainda tem q fazer um metodo p final)
		}
		public String description(){
			return ("Efetua um ataque");
		}
	}
	private class UsarItem extends Event{
		private int prior = 2;
		public UsarItem (long eventTime, Item item, Pokemon p) {
			super(eventTime);
		}
		public void action(){
			item.usaItem(p);
		}
		public String description(){
			return ("Utiliza um Item");
		}
	}
	private class Trocar extends Event{
		private int prior = 1;
		public Trocar (long eventTime, Treinador t, int i) {
			super(eventTime);
		}
		public void action(){
			t.trocaPoke(i);
		}
		public String description(){
			return ("Troca de Pokemon");
		}
	}
	private class Fugir extends Event{
		private int prior = 0;
		public Fugir (long eventTime, Treinador t) {
			super(eventTime);
		}
		public void action(){

		}
		public String description(){
			return ("Foge da batalha");
		}
	}
	public void Acabou {
		
	}
	public static void main(String[] args){
		
	}
}
