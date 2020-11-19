package metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    private Long id;
    private double solde;
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(Long id, double solde) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return this.dateCreation;
    }
    public void setDateCreation(Date d) {
        this.dateCreation = d;
    }

}
