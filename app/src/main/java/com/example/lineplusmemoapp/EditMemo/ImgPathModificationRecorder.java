package com.example.lineplusmemoapp.EditMemo;

import java.util.Iterator;
import java.util.Vector;

public class ImgPathModificationRecorder {

    private Vector<CustomImagePath> beAddedPathList;
    private Vector<Integer> beDeletedIidList;

    public ImgPathModificationRecorder() {
        beAddedPathList = new Vector<>();
        beDeletedIidList = new Vector<>();
    }

    public void addBeAddedPath (String path, int type) {
        beAddedPathList.add(new CustomImagePath(path, type));
    }

    public void addBeDeletedIid (int iid){
        beDeletedIidList.add(iid);
    }

    public void removeFromBeAddedPath(String derivedPath) {
        Iterator i = beAddedPathList.iterator();
        while(i.hasNext()) {
            if(((CustomImagePath)i.next()).getImagePath() == derivedPath) {
                i.remove();
                break;
            }
        }
    }

    public Vector<CustomImagePath> getBeAddedPathList() {
        return beAddedPathList;
    }

    public Vector<Integer> getBeDeletedIidList() {
        return beDeletedIidList;
    }
}