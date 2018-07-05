package poway.carnet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class File
{

	public static ObservableList<Personne> read()
	{
		Path path = Paths.get("./src/ressources/carnet.csv");
		List<String> read;

		try
		{
			read = Files.readAllLines(path);
			final ObservableList<Personne> personnes = FXCollections.observableArrayList();

			for (String string : read)
			{
				System.out.println(string);
				String delims = ";";
				Personne personne = new Personne(string.split(delims));
				personnes.add(personne);
			}
			return personnes;
		}
		catch (IOException e)
		{
			System.out.println("MARCHE PAS");
			e.printStackTrace();
		}
		return null;
	}

	public static void write()
	{
		Path path = Paths.get("./src/ressources/carnet.csv");
	}
}
