package com.example.criminalintent;


import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private boolean mRequiredPolice;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public boolean ismRequiredPolice() {
        return mRequiredPolice;
    }

    public void setRequiredPolice(boolean mRequiredPolice) {
        this.mRequiredPolice = mRequiredPolice;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }
}
