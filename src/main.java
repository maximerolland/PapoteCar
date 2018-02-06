import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Ville depart = new Ville("Paris");
        Ville arrive = new Ville("Lyon");
        Ville etape2 = new Ville("Bordeaux");
        Ville etape1 = new Ville("Niort");
        Ville etape = new Ville("Nantes");

        Passager c1 = new Passager("Maxime");

        Vehicule veh = new Vehicule(c1,5);
        Trajet t1 = new Trajet(depart,arrive,veh);

        t1.addEtape(etape);
        t1.addEtape(etape1);
        t1.addEtape(etape2);

        Passager p2 = new Passager("Paul");

        Voyage ins = new Voyage(depart,etape,p2);


        t1.add(ins);

        System.out.printf(t1.toString());

    }
}
