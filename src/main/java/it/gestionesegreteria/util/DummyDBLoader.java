package it.gestionesegreteria.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import it.gestionesegreteria.model.CorsoLaurea;
import it.gestionesegreteria.model.DummyDB;
import it.gestionesegreteria.model.Studente;

@Component
public class DummyDBLoader implements CommandLineRunner {

	@Autowired
	ApplicationContext ctx;

	@Override
	public void run(String... args) throws Exception {

		DummyDB dummyDb = ctx.getBean(DummyDB.class);
		valorizzaDb(dummyDb);
	}

	public void valorizzaDb(DummyDB db) {
		CorsoLaurea c1 = CorsoLaurea.builder().codice("a1").nome("Giurisprudenza").indirizzo("via Via Milano 1")
				.numeroEsami(11).build();
		CorsoLaurea c2 = CorsoLaurea.builder().codice("a2").nome("Scienze").indirizzo("via Napoli 1").numeroEsami(13)
				.build();
		CorsoLaurea c3 = CorsoLaurea.builder().codice("a3").nome("DAMS").indirizzo("via Roma 23").numeroEsami(15)
				.build();
		CorsoLaurea c4 = CorsoLaurea.builder().codice("a4").nome("Chimica").indirizzo("via dei bizantini 4")
				.numeroEsami(17).build();
		CorsoLaurea c5 = CorsoLaurea.builder().codice("a5").nome("Agraria").indirizzo("via Rino 4").numeroEsami(19)
				.build();
		CorsoLaurea c6 = CorsoLaurea.builder().codice("a6").nome("Latino").indirizzo("via Messina 5").numeroEsami(18)
				.build();
		CorsoLaurea c7 = CorsoLaurea.builder().codice("a7").nome("Ingegneria").indirizzo("via Pompea 7").numeroEsami(16)
				.build();
		CorsoLaurea c8 = CorsoLaurea.builder().codice("a8").nome("Psicologia").indirizzo("via Pippo 8").numeroEsami(14)
				.build();
		CorsoLaurea c9 = CorsoLaurea.builder().codice("a9").nome("Medicina").indirizzo("via Cavallo 104")
				.numeroEsami(12).build();

		Studente s1 = Studente.builder().matricola("s1").nome("Pippo").cognome("Baudo").dataNascita("1980-05-18")
				.email("pippo@hotmail.it").indirizzo("via lindo").citta("Villafranca").corsoLaurea(c1).build();
		Studente s2 = Studente.builder().matricola("s2").nome("Simone").cognome("Guidi").dataNascita("1996-06-27")
				.email("simot@gmail.com").indirizzo("via per bene").citta("Genova").corsoLaurea(c2).build();
		Studente s3 = Studente.builder().matricola("s3").nome("Pasquale").cognome("Torcasio").dataNascita("1996-04-29")
				.email("paco@gmail.it").indirizzo("via dei martiri").citta("Lamezia").corsoLaurea(c1).build();
		Studente s4 = Studente.builder().matricola("s4").nome("Mimmo").cognome("Modem").dataNascita("1994-09-11")
				.email("sanrick@yahoo.it").indirizzo("via Sambiase").citta("Cremona").corsoLaurea(c2).build();
		Studente s5 = Studente.builder().matricola("s5").nome("Alessio").cognome("Tabolacci").dataNascita("1989-05-14")
				.email("tabman@hotmail.com").indirizzo("Via Savutano").citta("Roma").corsoLaurea(c1).build();
		Studente s6 = Studente.builder().matricola("s6").nome("Topolina").cognome("Minnu").dataNascita("1997-06-27")
				.email("topina@gmail.it").indirizzo("via Ladri").citta("Roma").corsoLaurea(c3).build();
		Studente s7 = Studente.builder().matricola("s7").nome("Francesco").cognome("Maruca").dataNascita("1998-03-02")
				.email("franci@yahoo.it").indirizzo("via Pal").citta("Milano").corsoLaurea(c2).build();
		Studente s8 = Studente.builder().matricola("s8").nome("Antonello").cognome("Pagnozzi").dataNascita("1995-06-31")
				.email("anto@gmail.com").indirizzo("via Pagnozzi").citta("Roma").corsoLaurea(c4).build();
		Studente s9 = Studente.builder().matricola("s9").nome("Emmanuel").cognome("Fabiano").dataNascita("1995-07-23")
				.email("emmi@hotmail.it").indirizzo("via non ho piu idee 57").citta("Palermo").corsoLaurea(c2).build();

		db.aggiungiCorso(c1);
		db.aggiungiCorso(c2);
		db.aggiungiCorso(c3);
		db.aggiungiCorso(c4);
		db.aggiungiCorso(c5);
		db.aggiungiCorso(c6);
		db.aggiungiCorso(c7);
		db.aggiungiCorso(c8);
		db.aggiungiCorso(c9);

		db.aggiungiStudente(s1);
		db.aggiungiStudente(s2);
		db.aggiungiStudente(s3);
		db.aggiungiStudente(s4);
		db.aggiungiStudente(s5);
		db.aggiungiStudente(s6);
		db.aggiungiStudente(s7);
		db.aggiungiStudente(s8);
		db.aggiungiStudente(s9);
	}

}