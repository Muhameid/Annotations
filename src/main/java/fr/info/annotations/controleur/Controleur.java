package fr.info.annotations.controleur;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import  fr.info.annotations.modele.Joueur;
/*
 * injection des dépendances
 */
@RestController
public class Controleur {
    
    private ArrayList<Joueur> listeJoueurs;

    @Value("${message}") private String message;

    public Controleur() {
        this.listeJoueurs = new ArrayList<Joueur>();
        init();
    }
    
    public void init(){
        String[] n = {"tom","olive","tintin","asterix","lucky luke","gargamel"};
        String[] e = {"jerry","popeye","milou","obelix","joly jumper","azrael"};
        String[] c = {"tom.jerry@gmail.com","olive.popeye@gmail.com","tintin.milou@gmail.com","asterix.obelix@gmail.com","jolly@gmail.com","gargamel.azrael@gmail.com"};
        
        int i;

     for(i=0; i<n.length; i++){
        Joueur joueur3 = new Joueur(n[i],e[i],c[i]);
        listeJoueurs.add(joueur3);

    }
    }

    @GetMapping("/bienvenue")
    public String bienvenue(){
        return "bienvenue";
    }

    @GetMapping("/bienvenue/{nom}")
    public String nom(@PathVariable String nom) {
        System.out.println("nom = "+nom);
        return message+" : "+nom;
    }


    @GetMapping("/bienvenue/joueur/{nom}")
    public Joueur joueur(@PathVariable String nom) {
    Joueur joueur = new Joueur(nom);
        return joueur;
    }

    @GetMapping("/bienvenue/joueur/{nom}/{equipier}/{contact}")
    public Joueur joueur2(@PathVariable("nom") String nom, @PathVariable("equipier") String equipier, @PathVariable("contact") String contact) {
    Joueur joueur2 = new Joueur(nom,equipier,contact);
        return joueur2;
    }

    @GetMapping("/bienvenue/joueurs")
        public ArrayList<Joueur> listes(){
            return listeJoueurs;
        }

}