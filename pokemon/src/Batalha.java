
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

	Pokemon pikachu = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);

	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
	Pokemon abc = new Pokemon (abc, 100, at, at, at, at);
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
		public void action(Item item, Pokemon p){
			item.usaItem(p);
		}
		public String description(){
			return ("Utiliza um Item");
		}
	}
	private class Trocar extends Event{
		public Trocar (long eventTime) {
			super(eventTime);
		}
		public void action(Treinador t, int i){
			Pokemon Aux = t.pokemon[0];
			t.pokemon[0] = t.pokemon[i];
			t.pokemon[i] = Aux;
		}
		public String description(){
			return ("Troca de Pokemon");
		}
	}
	private class Fugir extends Event{
		public Fugir (long eventTime) {
			super(eventTime);
		}
		public void action(Treinador t){

		}
		public String description(){
			return ("Foge da batalha");
		}
	}
}
