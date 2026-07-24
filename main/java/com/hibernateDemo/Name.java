package com.hibernateDemo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Name
{
    private String fNmae;
    private  String lNmae;
    private  String mName;






    public String getfNmae() {
        return fNmae;
    }

    public void setfNmae(String fNmae) {
        this.fNmae = fNmae;
    }



    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlNmae() {
        return lNmae;
    }

    public void setlNmae(String lNmae) {
        this.lNmae = lNmae;
    }

    @Override
    public String toString() {
        return "Name{" +
                "fNmae='" + fNmae + '\'' +
                ", lNmae='" + lNmae + '\'' +
                ", mName='" + mName + '\'' +
                '}';
    }
}
