
public class Pokemon {
	private String nome;
	private final int maxHP;
	private int hp;
	private boolean vivo;
	private Ataque [] ataques = new Ataque[4];
	public Pokemon (String nome, int maxHP, Ataque at1, Ataque at2, Ataque at3, Ataque at4){
		this.nome = nome;
		this.maxHP = maxHP;
		this.hp = maxHP;
		this.ataques[0] = at1;
		this.ataques[1] = at2;
		this.ataques[2] = at3;
		this.ataques[3] = at4;
		this.vivo = true;
	}
	public String getNome(){
		return(nome);
	}
	public int getHP(){
		return(hp);
	}
	public int getMaxHP(){
		return(maxHP);
	}
	public boolean getEstado(){
		return vivo;
	}
	public Ataque getAtaque(int i){
		return ataques[i];
	}
	public void recuperaHP(int cura){
		if (hp + cura > maxHP){
			hp = maxHP;
			return;
		}
		hp = hp + cura;
	}
	public void morreu(){
		vivo = false;
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
