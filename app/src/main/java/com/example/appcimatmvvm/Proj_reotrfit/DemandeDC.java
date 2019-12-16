package com.example.appcimatmvvm.Proj_reotrfit;

public class DemandeDC {


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

    public DemandeDC(String charge_tarvaux, String charge_Consigantion, String charge_Conduit
            , String date_demande, String charge_Validation, String item_equppment
            , String type_Consignation, String n_cadns, String charge_tarvauxD
            , String charge_Conduitd, String charge_Consigantiond
            , String date_demandeDChargeT
            , String date_demandeDCConsigantion
            , String date_demandeDCConduit,
                     String date_Demandeconsigantion
            ,String date_DemandeDeconsigantion,String atelier,String travaux_A_Realise)
    {

        Charge_tarvaux=charge_tarvaux;
        Charge_Consigantion=charge_Consigantion;
        Charge_Conduit=charge_Conduit;
        Date_demande=date_demande;
        Charge_Validation=charge_Validation;
        Item_equppment=item_equppment;
        Type_Consignation=type_Consignation;
        N_cadns=n_cadns;
        Charge_tarvauxD=charge_tarvauxD;
        Charge_Conduitd=charge_Conduitd;
        Charge_Consigantiond=charge_Consigantiond;
        Date_demandeDChargeT=date_demandeDChargeT;
        Date_demandeDCConsigantion=date_demandeDCConsigantion;
        Date_demandeDCConduit=date_demandeDCConduit;
        Date_Demandeconsigantion=date_Demandeconsigantion;
        Date_DemandeDeconsigantion=date_DemandeDeconsigantion;
        Atelier=atelier;
        Travaux_A_Realise=travaux_A_Realise;

    }

}