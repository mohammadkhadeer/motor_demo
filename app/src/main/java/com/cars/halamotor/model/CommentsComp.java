package com.cars.halamotor.model;

public class CommentsComp {
    String commentContentStr,narratorTokenStr,narratorImageStr,commentTimeStampStr;

    public CommentsComp (){}

    public CommentsComp(String commentContentStr, String narratorTokenStr
            , String narratorImageStr, String commentTimeStampStr)
    {
        this.commentContentStr= commentContentStr;
        this.narratorTokenStr = narratorTokenStr;
        this.narratorImageStr = narratorImageStr;
        this.commentTimeStampStr = commentTimeStampStr;
    }

    public String getCommentContentStr() {
        return commentContentStr;
    }

    public void setCommentContentStr(String commentContentStr) {
        this.commentContentStr = commentContentStr;
    }

    public String getNarratorTokenStr() {
        return narratorTokenStr;
    }

    public void setNarratorTokenStr(String narratorTokenStr) {
        this.narratorTokenStr = narratorTokenStr;
    }

    public String getNarratorImageStr() {
        return narratorImageStr;
    }

    public void setNarratorImageStr(String narratorImageStr) {
        this.narratorImageStr = narratorImageStr;
    }

    public String getCommentTimeStampStr() {
        return commentTimeStampStr;
    }

    public void setCommentTimeStampStr(String commentTimeStampStr) {
        this.commentTimeStampStr = commentTimeStampStr;
    }
}
