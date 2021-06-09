package com.example.miwokapp;

import android.widget.ArrayAdapter;

public class word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    private int mimageResourceId = -1;
    private int noimage = -1;
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public word(String defaultTranslation, String miwokTranslation, int imageid, int audioid) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mimageResourceId = imageid;
       mAudioResourceId = audioid;
    }

    public word(String defaultTranslation, String miwokTranslation,int audioid) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioid;
        //mimageid=imageid;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public int getImageid() {
        return mimageResourceId;
    }

    public boolean hasImage() {//this will return the value that whether mimageResourceId men value h ya nhi mtlb image hai ya nahi
        return mimageResourceId != noimage;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}
