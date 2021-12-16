package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "orgs")
public class UserEntity {
    @Id
	private String id;

    private String NameOrg;
    private String INN;
    private String KPP;
    private String Address;
    private String Surname;
    private String Name;
    private String Patron;
    private String Category;
    private String Telefon;
    private String email;
    private String Debt;
    private String Price;
    private String OKPO;
    private String Site;

    public UserEntity() {
    }


    public UserEntity(String id, String NameOrg, String INN, String KPP, String Address, String Surname, String Name, String Patron, String Category, String Telefon, String email, String Debt, String Price, String OKPO, String Site) {
        this.id = id;
        this.NameOrg = NameOrg;
        this.INN = INN;
        this.KPP = KPP;
        this.Address = Address;
        this.Surname = Surname;
        this.Name = Name;
        this.Patron = Patron;
        this.Category = Category;
        this.Telefon = Telefon;
        this.email = email;
        this.Debt = Debt;
        this.Price = Price;
        this.OKPO = OKPO;
        this.Site = Site;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOrg() {
        return this.NameOrg;
    }

    public void setNameOrg(String NameOrg) {
        this.NameOrg = NameOrg;
    }

    public String getINN() {
        return this.INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getKPP() {
        return this.KPP;
    }

    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSurname() {
        return this.Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPatron() {
        return this.Patron;
    }

    public void setPatron(String Patron) {
        this.Patron = Patron;
    }

    public String getCategory() {
        return this.Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getTelefon() {
        return this.Telefon;
    }

    public void setTelefon(String Telefon) {
        this.Telefon = Telefon;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDebt() {
        return this.Debt;
    }

    public void setDebt(String Debt) {
        this.Debt = Debt;
    }

    public String getPrice() {
        return this.Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getOKPO() {
        return this.OKPO;
    }

    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
    }

    public String getSite() {
        return this.Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }



}
