package fr.info.annotations.modele;

public class Joueur {
    private String nom;
    private String equipier;
    private String contact;
    

    public Joueur(String nom){
        this.nom =nom;
    }
     public Joueur(String nom, String equipier, String contact ){
        this.nom =nom;
        this.equipier =equipier;
        this.contact =contact;
    }


    
   
    public String getNom() { return nom;}
    public String getEquipier() { return equipier;}
    public String getContact() { return contact;}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEquipier(String equipier) {
        this.equipier = equipier;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
