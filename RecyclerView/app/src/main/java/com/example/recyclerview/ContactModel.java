package com.example.recyclerview;

public class ContactModel {

    int img;
    String contactName, contactNum;

    public int getImg() {
        return img;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNum() {
        return contactNum;
    }

    //parameterized constructor
    public ContactModel(int img, String contactName, String contactNum){
        this.img = img;
        this.contactName = contactName;
        this.contactNum = contactNum;
    }



}
