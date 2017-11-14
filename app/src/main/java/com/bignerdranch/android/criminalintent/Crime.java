package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;
import java.util.*;


/**
 * Created by mike on 9/22/17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private String mDate;
    private boolean mSolved;
    private boolean mRequiresPolice;


    public Crime() {
        mId = UUID.randomUUID();
        mDate = DateFormat.getDateInstance(DateFormat.FULL).format(new Date());
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public boolean arePoliceRequired() { return mRequiresPolice; }

    public void setPoliceRequirement(boolean mRequiresPolice) { this.mRequiresPolice = mRequiresPolice; }
}
