package org.example.sabrimerroun.controller;

import org.springframework.ui.Model;
import org.example.sabrimerroun.model.Evenement;
import org.example.sabrimerroun.repository.EvenementRepository;
import org.example.sabrimerroun.repository.LocatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class EvenementController {

    @Autowired
    private EvenementRepository evenementRepository;

    @Autowired
    private LocatieRepository locatieRepository;

    // Index pagina
    @GetMapping("/")
    public String index(Model model) {
        List<Evenement> evenementen = evenementRepository.findTop10ByOrderByTijdstipDesc();
        model.addAttribute("evenementen", evenementen);
        return "index";
    }

    // New evenement pagina
    @GetMapping("/new")
    public String newEvenement(Model model) {
        model.addAttribute("evenement", new Evenement());
        model.addAttribute("locaties", locatieRepository.findAll());
        return "new";
    }

    // Evenement opslaan
    @PostMapping("/new")
    public String saveEvenement(@ModelAttribute Evenement evenement, Model model) {
        // Basis validatie
        if (evenement.getTitel() == null || evenement.getTitel().trim().isEmpty() ||
                evenement.getOrganisatie() == null || evenement.getOrganisatie().trim().isEmpty() ||
                evenement.getMailContactpersoon() == null || !evenement.getMailContactpersoon().contains("@")) {

            model.addAttribute("error", "Vul alle velden correct in!");
            model.addAttribute("locaties", locatieRepository.findAll());
            return "new";
        }

        evenementRepository.save(evenement);
        return "redirect:/";
    }

    // Details pagina
    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        Optional<Evenement> evenement = evenementRepository.findById(id);
        if (evenement.isPresent()) {
            model.addAttribute("evenement", evenement.get());
            return "details";
        }
        return "redirect:/";
    }

    // About pagina
    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
