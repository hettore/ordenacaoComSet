package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.ComparatoNomeGeneroTempoEpisodio;
import entities.Series;

public class Program {

	public static void main(String[] args) {

		System.out.println("Ordem aleatória: ");
		Set<Series> minhasSeries = new HashSet<>() {{
				add(new Series("dark", "drama", 60));
				add(new Series("got", "fantasia", 60));
				add(new Series("that '70s show", "comédia", 25));

			}};

		for (Series series : minhasSeries)
			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoDeEpisodio());

		System.out.println();

		System.out.println("Ordem de inserção: ");
		Set<Series> minhasSeries1 = new LinkedHashSet<>() {{
				add(new Series("dark", "drama", 60));
				add(new Series("got", "fantasia", 60));
				add(new Series("that '70s show", "comédia", 25));

			}};

		for (Series series : minhasSeries1)
			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoDeEpisodio());

		System.out.println();

		System.out.println("Ordem natural: (Tempo de episódio) ");
		Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);

		for (Series series : minhasSeries2)
			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoDeEpisodio());
		
		System.out.println();
		
		System.out.println("Ordem Nome/Genero/TempoDeEpisodio ");
		Set<Series> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio()); 
		minhasSeries3.addAll(minhasSeries);

		for (Series series : minhasSeries3)
			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoDeEpisodio());
		
		System.out.println();
		
	}

}
