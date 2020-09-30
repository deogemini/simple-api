package com.amala.demo.domain;


import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Institution_Table")
public class Institution extends AbstractPersistable<Long> {

    @Column(name= "LegalName", unique = true, nullable = false, length = 100)
    private String Lname;

    @Column(name= "BrandName", nullable = false, length = 100)
    private String Bname;

    @Column(name= "OfficeType", nullable = false, length = 50)
    private String Office;

    @Column(name= "RegistrationNo", nullable = false, length = 30)
    private Double RegNo;

    @Column(name= "VatNo", nullable = true, length = 30)
    private Double VatNo;

    @Column(name= "RegisteredYear", nullable = false, length = 50)
    private int YearReg;

    @Column(name= "PoBox", nullable = false, length = 50)
    private int PoBox;

    @Column(name= "Area", nullable = true, length = 50)
    private String Area;

    @Column(name= "City", nullable = false, length = 50)
    private String City;

    @Column(name= "Regional", nullable = true, length = 50)
    private  String Regional;

    @Column(name= "District", nullable = false, length = 50)
    private String District;

    @Column(name= "Ward", nullable = false, length = 50)
    private String Ward;

    @Column(name= "PostCode_5", nullable = false, length = 5)
    private Double PostCode_5;

    @Column(name= "PostCode_6", nullable = false, length = 6)
    private Double PostCode_6;

    @Column(name= "MobileNo", nullable = false, length = 10)
    private Float MobileNo;

    @Column(name= "TelNo", nullable = false, length = 20)
    private Float TelNo;

    @Column(name= "email", nullable = false, length = 50)
    private String email;

    @Column(name= "website", nullable = false, length = 50)
    private String website;

    public Institution(String lname, String bname, String office, Double regNo, Double vatNo, int yearReg, int poBox, String area, String city, String regional, String district, String ward, Double postCode_5, Double postCode_6, Float mobileNo, Float telNo, String email, String website) {
        Lname = lname;
        Bname = bname;
        Office = office;
        RegNo = regNo;
        VatNo = vatNo;
        YearReg = yearReg;
        PoBox = poBox;
        Area = area;
        City = city;
        Regional = regional;
        District = district;
        Ward = ward;
        PostCode_5 = postCode_5;
        PostCode_6 = postCode_6;
        MobileNo = mobileNo;
        TelNo = telNo;
        this.email = email;
        this.website = website;
    }

    public Institution() {
        
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public String getOffice() {
        return Office;
    }

    public void setOffice(String office) {
        Office = office;
    }

    public Double getRegNo() {
        return RegNo;
    }

    public void setRegNo(Double regNo) {
        RegNo = regNo;
    }

    public Double getVatNo() {
        return VatNo;
    }

    public void setVatNo(Double vatNo) {
        VatNo = vatNo;
    }

    public int getYearReg() {
        return YearReg;
    }

    public void setYearReg(int yearReg) {
        YearReg = yearReg;
    }

    public int getPoBox() {
        return PoBox;
    }

    public void setPoBox(int poBox) {
        PoBox = poBox;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegional() {
        return Regional;
    }

    public void setRegional(String regional) {
        Regional = regional;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public String getWard() {
        return Ward;
    }

    public void setWard(String ward) {
        Ward = ward;
    }

    public Double getPostCode_5() {
        return PostCode_5;
    }

    public void setPostCode_5(Double postCode_5) {
        PostCode_5 = postCode_5;
    }

    public Double getPostCode_6() {
        return PostCode_6;
    }

    public void setPostCode_6(Double postCode_6) {
        PostCode_6 = postCode_6;
    }

    public Float getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(Float mobileNo) {
        MobileNo = mobileNo;
    }

    public Float getTelNo() {
        return TelNo;
    }

    public void setTelNo(Float telNo) {
        TelNo = telNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
