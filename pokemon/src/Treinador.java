
public class Treinador {
	private String nome;
	private final int nPokes;
	private int aptos;
	private Pokemon pokemons[] = new Pokemon[6];
	public Treinador (String nome, int n, Pokemon poke1, Pokemon poke2, Pokemon poke3, Pokemon poke4, Pokemon poke5, Pokemon poke6){
		this.nome = nome;
		nPokes = n;
		aptos = n;
		pokemons[0] = poke1;
		pokemons[1] = poke2;
		pokemons[2] = poke3;
		pokemons[3] = poke4;
		pokemons[4] = poke5;
		pokemons[5] = poke6;
		
	}
	public Treinador (String nome, int n, Pokemon poke1, Pokemon poke2, Pokemon poke3, Pokemon poke4, Pokemon poke5){
		this (nome,n, poke1, poke2, poke3, poke4, poke5, null);
	}
	public Treinador (String nome, int n, Pokemon poke1, Pokemon poke2, Pokemon poke3, Pokemon poke4){
		this (nome,n, poke1, poke2, poke3, poke4, null, null);
	}
	public Treinador (String nome, int n, Pokemon poke1, Pokemon poke2, Pokemon poke3){
		this (nome,n, poke1, poke2, poke3, null, null, null);
	}
	public Treinador (String nome, int n, Pokemon poke1, Pokemon poke2){
		this (nome,n, poke1, poke2, null, null, null, null);
	}
	public Treinador (String nome, int n, Pokemon poke1){
		this (nome,n, poke1, null, null, null, null, null);
	}
	public boolean perdeu(){
		if (aptos == 0){
			System.out.println(nome+" perdeu.");
			return true;
		}
		return false;
	}
	public void pokeMorreu(){
		aptos = aptos - 1;
	}
}
