
public class pokemon {
	private String nome;
	private final int maxHP;
	private int hp;
	private int tipo;
	private Ataque [] ataques = new Ataque[4];
	public pokemon(String nome, int maxHP, int hp, int tipo, Ataque at1, Ataque at2, Ataque at3, Ataque at4){
		this.nome = nome;
		this.maxHP = maxHP;
		this.hp = hp;
		this.tipo = tipo;
		this.ataques[0] = at1;
		this.ataques[1] = at2;
		this.ataques[2] = at3;
		this.ataques[3] = at4;
	}
	public String getNome(){
		return(nome);
	}
	public int getHP(){
		return(hp);
	}
	public int getTipo(){
		return(tipo);
	}
	public void morreu(){
		System.out.println(this.nome + " desmaiou!");
	}
	public void tomaDano(int dano){
		if(dano >= hp){
			hp = 0;
			this.morreu();
			return;
		}
		this.hp = this.hp - dano;
	}
}
