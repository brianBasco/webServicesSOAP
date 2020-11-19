package ws;

import metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(name = "BanqueWS")
public class Banque {

    @WebMethod
    public double conversion(@WebParam(name = "montant") double c) {
        return c * 6.5557;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "id") Long id) {
        return new Compte(id, 1000*Math.random());
    }

    @WebMethod
    public List<Compte> listeComptes() {
        List<Compte> l = new ArrayList<Compte>();
        l.add( this.getCompte(1L));
        l.add( this.getCompte(2L));
        l.add( this.getCompte(3L));
        return l;
    }


}
