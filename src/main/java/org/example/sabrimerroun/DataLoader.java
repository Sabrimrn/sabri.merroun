package org.example.sabrimerroun;

import org.example.sabrimerroun.model.Evenement;
import org.example.sabrimerroun.model.Locatie;
import org.example.sabrimerroun.repository.EvenementRepository;
import org.example.sabrimerroun.repository.LocatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private LocatieRepository locatieRepository;

    @Autowired
    private EvenementRepository evenementRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Voeg locaties toe
        Locatie gemeenschapscentrum = new Locatie("Gemeenschapscentrum Anderlecht", "Bergensesteenweg 123, 1070 Anderlecht", 150);
        Locatie sporthal = new Locatie("Sporthal De Molen", "Molenstraat 45, 1070 Anderlecht", 200);
        Locatie bibliotheek = new Locatie("Bibliotheek Anderlecht", "Wayezstraat 29, 1070 Anderlecht", 80);
        Locatie park = new Locatie("Astridpark", "Astridplein 1, 1070 Anderlecht", 300);
        Locatie buurthuis = new Locatie("Buurthuis De Schakel", "Verheydenstraat 15, 1070 Anderlecht", 60);

        locatieRepository.save(gemeenschapscentrum);
        locatieRepository.save(sporthal);
        locatieRepository.save(bibliotheek);
        locatieRepository.save(park);
        locatieRepository.save(buurthuis);

        // 10 realistische evenementen
        Evenement event1 = new Evenement();
        event1.setTitel("Gratis Juridisch Advies");
        event1.setOmschrijving("Maandelijkse spreekuur met pro bono advocaten voor mensen met beperkte middelen. Hulp bij huurproblemen, sociale zekerheid en familierecht.");
        event1.setOrganisatie("Eigen beheer");
        event1.setMailContactpersoon("juridisch@ngo-anderlecht.be");
        event1.setTijdstip(LocalDateTime.now().plusDays(3));
        event1.setLocatie(gemeenschapscentrum);
        evenementRepository.save(event1);

        Evenement event2 = new Evenement();
        event2.setTitel("Taallessen Nederlands voor Beginners");
        event2.setOmschrijving("Wekelijkse Nederlandse lessen voor nieuwkomers en anderstaligen. Focus op praktische communicatie voor dagelijkse situaties.");
        event2.setOrganisatie("Vzw Taalbruggen");
        event2.setMailContactpersoon("lessen@taalbruggen.be");
        event2.setTijdstip(LocalDateTime.now().plusDays(5));
        event2.setLocatie(bibliotheek);
        evenementRepository.save(event2);

        Evenement event3 = new Evenement();
        event3.setTitel("Buurtfeest Astridpark");
        event3.setOmschrijving("Jaarlijks buurtfeest met gratis barbecue, kinderanimatie en live muziek. Voor alle bewoners van Anderlecht en omgeving.");
        event3.setOrganisatie("Buurtcomité Astrid");
        event3.setMailContactpersoon("feest@buurtcomite-astrid.be");
        event3.setTijdstip(LocalDateTime.now().plusDays(14));
        event3.setLocatie(park);
        evenementRepository.save(event3);

        Evenement event4 = new Evenement();
        event4.setTitel("Digitale Vaardigheden voor Senioren");
        event4.setOmschrijving("Workshop over smartphone gebruik, online bankieren en social media voor 55-plussers. Laptops worden voorzien.");
        event4.setOrganisatie("Eigen beheer");
        event4.setMailContactpersoon("digitaal@ngo-anderlecht.be");
        event4.setTijdstip(LocalDateTime.now().plusDays(7));
        event4.setLocatie(buurthuis);
        evenementRepository.save(event4);

        Evenement event5 = new Evenement();
        event5.setTitel("Voedseluitdeling");
        event5.setOmschrijving("Wekelijkse uitdeling van verse groenten, fruit en houdbare producten voor gezinnen in financiële moeilijkheden.");
        event5.setOrganisatie("Voedselbank Brussel");
        event5.setMailContactpersoon("verdeling@voedselbank-bxl.be");
        event5.setTijdstip(LocalDateTime.now().plusDays(2));
        event5.setLocatie(gemeenschapscentrum);
        evenementRepository.save(event5);

        Evenement event6 = new Evenement();
        event6.setTitel("Sollicitatietraining");
        event6.setOmschrijving("Interactieve workshop over cv schrijven, sollicitatiebrieven en gesprekstechnieken. Inclusief individuele coaching.");
        event6.setOrganisatie("JobConnect Brussels");
        event6.setMailContactpersoon("training@jobconnect.be");
        event6.setTijdstip(LocalDateTime.now().plusDays(10));
        event6.setLocatie(bibliotheek);
        evenementRepository.save(event6);

        Evenement event7 = new Evenement();
        event7.setTitel("Multiculturele Kookworkshop");
        event7.setOmschrijving("Samen koken en proeven van gerechten uit verschillende culturen. Recepten uit Marokko, Turkije, Congo en België.");
        event7.setOrganisatie("Eigen beheer");
        event7.setMailContactpersoon("koken@ngo-anderlecht.be");
        event7.setTijdstip(LocalDateTime.now().plusDays(12));
        event7.setLocatie(buurthuis);
        evenementRepository.save(event7);

        Evenement event8 = new Evenement();
        event8.setTitel("Gratis Gezondheidschecks");
        event8.setOmschrijving("Bloeddruk meten, BMI berekenen en algemene gezondheidsadvies door vrijwillige verpleegkundigen en artsen.");
        event8.setOrganisatie("Artsen Zonder Grenzen");
        event8.setMailContactpersoon("gezondheid@azg.be");
        event8.setTijdstip(LocalDateTime.now().plusDays(8));
        event8.setLocatie(gemeenschapscentrum);
        evenementRepository.save(event8);

        Evenement event9 = new Evenement();
        event9.setTitel("Sportdag voor Jongeren");
        event9.setOmschrijving("Gratis sportactiviteiten voor jongeren tussen 12-18 jaar: voetbal, basketbal, tafeltennis en fitness. Gezonde snacks inbegrepen.");
        event9.setOrganisatie("Sport4All Anderlecht");
        event9.setMailContactpersoon("jeugd@sport4all.be");
        event9.setTijdstip(LocalDateTime.now().plusDays(6));
        event9.setLocatie(sporthal);
        evenementRepository.save(event9);

        Evenement event10 = new Evenement();
        event10.setTitel("Financieel Advies en Budgetbeheer");
        event10.setOmschrijving("Persoonlijke begeleiding bij het opstellen van een huishoudbudget en advies over schuldbemiddeling en besparingen.");
        event10.setOrganisatie("CAW Brussel");
        event10.setMailContactpersoon("financieel@caw-brussel.be");
        event10.setTijdstip(LocalDateTime.now().plusDays(9));
        event10.setLocatie(bibliotheek);
        evenementRepository.save(event10);
    }
}
