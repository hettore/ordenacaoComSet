package entities;

import java.util.Objects;

public class Series implements Comparable <Series>{

	private String nome;
	private String genero;
	private Integer tempoDeEpisodio;
	
	public Series(String nome, String genero, Integer tempoDeEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoDeEpisodio = tempoDeEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoDeEpisodio() {
		return tempoDeEpisodio;
	}

	public void setTempoDeEpsodio(Integer tempoDeEpisodio) {
		this.tempoDeEpisodio = tempoDeEpisodio;
	}
	
	@Override
	public String toString() {
		return "{" +
				"nome= '" + nome + '\'' +
				", genero='" + genero + '\''+
				", tempoDeEpisodio=" + tempoDeEpisodio +
				'}';		
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoDeEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Series other = (Series) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoDeEpisodio, other.tempoDeEpisodio);
	}

	@Override
	public int compareTo(Series series) {
		int tempoEpisodio = Integer.compare(this.getTempoDeEpisodio(), series.getTempoDeEpisodio());
		if (tempoEpisodio != 0) return tempoEpisodio;
		
		return this.getGenero().compareTo(series.getGenero());
	}

	
	
	
	
}
