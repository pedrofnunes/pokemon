public class Ataque {
	private String nome;
	private int dano;
	private int prior;
	public Ataque (String nome, int dano, int prior){
		this.nome = nome;
		this.dano = dano;
		this.prior = prior;
	}
	public int getPrior(){
		return prior;
	}
	public String getNome(){
		return nome;
	}
	public int getDano(){
		return dano;
	}
	public void usar (Pokemon p){
		p.tomaDano (dano);
	}
}
