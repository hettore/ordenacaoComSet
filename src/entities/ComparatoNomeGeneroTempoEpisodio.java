package entities;

import java.util.Comparator;

public class ComparatoNomeGeneroTempoEpisodio implements Comparator<Series>{

	@Override
	public int compare(Series s1, Series s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if (nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if (genero != 0) return genero;
		
		return Integer.compare(s1.getTempoDeEpisodio(), s2.getTempoDeEpisodio());
		
	}

	
}
