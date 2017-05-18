package com.dcastalia.readingjsonfromfile;

/**
 * Created by piashsarker on 5/18/17.
 */

public class Company {

    protected String name;
    private String companyType;
    private String companyLogo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

}
