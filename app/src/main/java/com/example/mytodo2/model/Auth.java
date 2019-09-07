package com.example.mytodo2.model;

public class Auth {
    private static final String EMAIL = "ken@hotmail.com"; //**
    private static final String PASSWORD = "123456"; //**


    private String mMail;
    private  String mPassword;

    public Auth(String mMail,String mPassword){
        this.mMail = mMail;
        this.mPassword = mPassword;
    }

    public String getmMail() {
        return mMail;
    }

    public void setmMail(String mMail) {
        this.mMail = mMail;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
    public boolean check(){
        if(mMail.equals(EMAIL)&&mPassword.equals(PASSWORD)){
            return true;
        }
        else{
            return  false;
        }
    }
}
