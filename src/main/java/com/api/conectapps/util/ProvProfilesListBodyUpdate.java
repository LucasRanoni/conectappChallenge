package com.api.conectapps.util;

public class ProvProfilesListBodyUpdate {

    private String addSoProvProfileIdList;


    public ProvProfilesListBodyUpdate(){}

    public ProvProfilesListBodyUpdate(String addSoProvProfileIdList, String removeSoProvProfileIdList) {
        this.addSoProvProfileIdList = addSoProvProfileIdList;
    }

    public String getAddSoProvProfileIdList() {
        return addSoProvProfileIdList;
    }

    public void setAddSoProvProfileIdList(String addSoProvProfileIdList) {
        this.addSoProvProfileIdList = addSoProvProfileIdList;
    }
}
