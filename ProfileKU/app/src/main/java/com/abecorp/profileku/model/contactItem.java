/*
Tanggal Pengerjaan : 15 - 05 - 2019
NIM     : 10116342
Nama    : Ma'sum Abdul Matin
Kelas   : IF 8
 */
package com.abecorp.profileku.model;

public class contactItem {

    private  String fnim, fnama, fkelas, fhp, femail, fsosmed;
    private int id;

    public contactItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public contactItem(String fnim, String fnama, String fkelas, String fhp, String femail, String fsosmed) {
        this.fnim = fnim;
        this.fnama = fnama;
        this.fkelas = fkelas;
        this.fhp = fhp;
        this.femail = femail;
        this.fsosmed = fsosmed;
    }



    //Getter

    public String getFnim() { return fnim; }

    public String getFnama() {
        return fnama;
    }

    public String getFkelas() {
        return fkelas;
    }

    public String getFhp() {
        return fhp;
    }

    public String getFemail() {
        return femail;
    }

    public String getFsosmed() {
        return fsosmed;
    }

    //Setter

    public void setFnim(String fnim) {
        this.fnim = fnim;
    }

    public void setFnama(String fnama) {
        this.fnama = fnama;
    }

    public void setFkelas(String fkelas) {
        this.fkelas = fkelas;
    }

    public void setFhp(String fhp) {
        this.fhp = fhp;
    }

    public void setFemail(String femail) {
        this.femail = femail;
    }

    public void setFsosmed(String fsosmed) {
        this.fsosmed = fsosmed;
    }
}
