package rs.fon.jgrass.main;

import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.fon.jgrass.domain.Member;
import rs.fon.jgrass.domain.Member1;

public class Main {

	public static void main(String[] args) throws Exception {
		// kreiranje stream-a podataka od fajla sa podacima
		FileReader reader = new FileReader("data/member.json");

		// kreiranje Gson objekta
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		// konverzija iz JSON formata u Java instancu
		Member m = gson.fromJson(reader, Member.class);
		System.out.println(m);

		// promena datuma rodjenja
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		Date d = sdf.parse("10.12.1970");
		m.setBirthDate(d);

		// konverzija iz Java objekta u JSON format
		FileWriter writer = new FileWriter("data/updatedMember.json");
		writer.write(gson.toJson(m));
		writer.close();

		// konverzija u klasu Member1
		FileReader reader1 = new FileReader("data/member.json");
		Member1 m1 = gson.fromJson(reader1, Member1.class);
		System.out.println(m1);
	}

}
