import java.util.ArrayList;
import java.util.HashMap;

public class Trajet {

    public Ville depart ;
    public ArrayList<Ville> etapes = new ArrayList<Ville>();
    public ArrayList<Voyage> voyages = new ArrayList<Voyage>();
    public Ville arrive ;
    public Vehicule voiture ;

    public Trajet(Ville depart,Ville arrive,Vehicule voiture){
        this.depart = depart ;
        this.arrive = arrive ;
        this.voiture = voiture;
    }

    public void addEtape(Ville etape) {
        this.etapes.add(etape);
    }

    public void add(Voyage ins) {
        this.voyages.add(ins);
    }

    public String toString() {
//        HashMap<>
        String retour = "";
        String sautDeLigne = "\n---------------------------------------------------------";
        retour = retour + "Ville de depart :"+this.depart+ "\n  Liste des étapes : "+ this.etapes ;
        retour = retour + "\nVille d'arriver : "+ this.arrive +"\nVoiture : "+this.voiture ;
        retour = retour +" Pour le voyage :"+ this.voyages ;
        retour = retour + sautDeLigne;

//        for(Ville v:this.etapes){
//            retour = "Au début, places libres : "+ this.voiture.placeLibre ;
//        }

        return retour;
    }
}
