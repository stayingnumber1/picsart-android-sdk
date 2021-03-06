package com.picsart.api;

/**
 * This abstract class serves as Listener for notification of responses,
 * It uses indexing for identification and accessibility.
 *
 *  This class is a member of the  www.picsart.com
 *
 * @author  Arman Andreasyan
 */

public abstract class RequestListener {
    private int indexOfListener;
    private int indexInList;


    public int getIndexOfListener() {
        return indexOfListener;
    }

    public void setIndexOfListener(int indexOfListener) {
        this.indexOfListener = indexOfListener;
    }

    public int getIndexInList() {
        return indexInList;
    }
    public void setIndexInList(int indexInList) {
        this.indexInList = indexInList;
    }


    public abstract void onRequestReady(int reqnumber, String message);
    public RequestListener(int idOfListener) {
        this.indexOfListener = idOfListener;
    }


}
