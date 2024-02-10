package ws;

import java.util.Date;

public class Compte {
    private int id;
    private double solde;
    private Date dateCreation;


    public Compte(){

    }

    public Compte(int id, double solde, Date dateCreation) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        id = id;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
