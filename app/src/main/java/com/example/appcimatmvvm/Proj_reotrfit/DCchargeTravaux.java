package com.example.appcimatmvvm.Proj_reotrfit;

public class DCchargeTravaux {


    private String Charge_tarvaux;
    private String Charge_Consigantion;
    private String Charge_Conduit;
    private String Date_demande;
    private String Charge_Validation;
    private String Item_equppment;
    private String Type_Consignation;
    private String N_cadns;

    private String Charge_tarvauxD;
    private String Charge_Conduitd, Charge_Consigantiond
            , Date_demandeDChargeT, Date_demandeDCConsigantion
            , Date_demandeDCConduit, Date_Demandeconsigantion,Date_DemandeDeconsigantion,Atelier,Travaux_A_Realise;

    public String getCharge_tarvaux() {
        return Charge_tarvaux;
    }

    public void setCharge_tarvaux(String charge_tarvaux) {
        Charge_tarvaux=charge_tarvaux;
    }

    public String getCharge_Consigantion() {
        return Charge_Consigantion;
    }

    public void setCharge_Consigantion(String charge_Consigantion) {
        Charge_Consigantion=charge_Consigantion;
    }

    public String getCharge_Conduit() {
        return Charge_Conduit;
    }

    public void setCharge_Conduit(String charge_Conduit) {
        Charge_Conduit=charge_Conduit;
    }

    public String getDate_demande() {
        return Date_demande;
    }

    public void setDate_demande(String date_demande) {
        Date_demande=date_demande;
    }

    public String getCharge_Validation() {
        return Charge_Validation;
    }

    public void setCharge_Validation(String charge_Validation) {
        Charge_Validation=charge_Validation;
    }

    public String getItem_equppment() {
        return Item_equppment;
    }

    public void setItem_equppment(String item_equppment) {
        Item_equppment=item_equppment;
    }

    public String getType_Consignation() {
        return Type_Consignation;
    }

    public void setType_Consignation(String type_Consignation) {
        Type_Consignation=type_Consignation;
    }

    public String getN_cadns() {
        return N_cadns;
    }

    public void setN_cadns(String n_cadns) {
        N_cadns=n_cadns;
    }

    public String getCharge_tarvauxD() {
        return Charge_tarvauxD;
    }

    public void setCharge_tarvauxD(String charge_tarvauxD) {
        Charge_tarvauxD=charge_tarvauxD;
    }

    public String getCharge_Conduitd() {
        return Charge_Conduitd;
    }

    public void setCharge_Conduitd(String charge_Conduitd) {
        Charge_Conduitd=charge_Conduitd;
    }

    public String getCharge_Consigantiond() {
        return Charge_Consigantiond;
    }

    public void setCharge_Consigantiond(String charge_Consigantiond) {
        Charge_Consigantiond=charge_Consigantiond;
    }

    public String getDate_demandeDChargeT() {
        return Date_demandeDChargeT;
    }

    public void setDate_demandeDChargeT(String date_demandeDChargeT) {
        Date_demandeDChargeT=date_demandeDChargeT;
    }

    public String getDate_demandeDCConsigantion() {
        return Date_demandeDCConsigantion;
    }

    public void setDate_demandeDCConsigantion(String date_demandeDCConsigantion) {
        Date_demandeDCConsigantion=date_demandeDCConsigantion;
    }

    public String getDate_demandeDCConduit() {
        return Date_demandeDCConduit;
    }

    public void setDate_demandeDCConduit(String date_demandeDCConduit) {
        Date_demandeDCConduit=date_demandeDCConduit;
    }

    public String getDate_Demandeconsigantion() {
        return Date_Demandeconsigantion;
    }

    public void setDate_Demandeconsigantion(String date_Demandeconsigantion) {
        Date_Demandeconsigantion=date_Demandeconsigantion;
    }

    public String getDate_DemandeDeconsigantion() {
        return Date_DemandeDeconsigantion;
    }

    public void setDate_DemandeDeconsigantion(String date_DemandeDeconsigantion) {
        Date_DemandeDeconsigantion=date_DemandeDeconsigantion;
    }

    public String getAtelier() {
        return Atelier;
    }

    public void setAtelier(String atelier) {
        Atelier=atelier;
    }

    public String getTravaux_A_Realise() {
        return Travaux_A_Realise;
    }

    public void setTravaux_A_Realise(String travaux_A_Realise) {
        Travaux_A_Realise=travaux_A_Realise;
    }

    public static class LoginPerson {


        private  String MATRICULE;
        private  String Nom_Prenom;
        private  boolean H_Charge_Travaux;
        private  boolean H_Charge_conduite;
        private  boolean H_Consignation_HT;
        private  boolean H_Consigantio_BT;
        private  boolean AdminAPP;
        private  int  N_TEL;
        private String PWD_USER;

        public LoginPerson(String MATRICULE, String nom_Prenom, int n_TEL, String PWD_USER) {
            this.MATRICULE=MATRICULE;
            Nom_Prenom=nom_Prenom;
            N_TEL=n_TEL;
            this.PWD_USER=PWD_USER;
        }

        public String getMATRICULE() {
            return MATRICULE;
        }

        public String getNom_Prenom() {
            return Nom_Prenom;
        }

        public boolean isH_Charge_Travaux() {
            return H_Charge_Travaux;
        }

        public boolean isH_Charge_conduite() {
            return H_Charge_conduite;
        }

        public boolean isH_Consignation_HT() {
            return H_Consignation_HT;
        }

        public boolean isH_Consigantio_BT() {
            return H_Consigantio_BT;
        }

        public boolean isAdminAPP() {
            return AdminAPP;
        }

        public int getN_TEL() {
            return N_TEL;
        }
    }
}
