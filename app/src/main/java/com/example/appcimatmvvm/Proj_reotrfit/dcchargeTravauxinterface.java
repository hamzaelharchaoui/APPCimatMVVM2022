package com.example.appcimatmvvm.Proj_reotrfit;

public class dcchargeTravauxinterface {
     private  int DCid;
     private String  charge_travaux;
     private String Item_equppment;
     private  String Atelier;

    public dcchargeTravauxinterface(int DCid, String charge_travaux1, String item_equppment, String atelier) {
        this.DCid=DCid;
        charge_travaux=charge_travaux1;
        Item_equppment=item_equppment;
        Atelier=atelier;
    }

    public int getDCidFor() { return DCid; }

    public String getCharge_travauxFor() {
        return charge_travaux;
    }

    public String getItem_equppment() {
        return Item_equppment;
    }

    public String getAtelierFOR() {
        return Atelier;
    }
}
