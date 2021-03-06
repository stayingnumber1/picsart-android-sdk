package com.picsart.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * This class serves as POJO for Comments
 * Also it serves as class type for instantiating
 * Comment objects from Json.
 *
 * <p>This class is a member of the
 * <a href="www.com.picsart.com">
 * </a>.
 *
 * @author  Arman Andreasyan 2/23/15
 */

public class Comment {

    SimpleDateFormat sdf;
    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("created")
    @Expose
    private String created;

    private Date creat;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_social")
    @Expose
    private boolean isSocial;

    @SerializedName("user_id")
    @Expose
    private String commenterId;

    @SerializedName("username")
    @Expose
    private String commenterUserName;

    private String potoID;

    public String getPotoID() {
        return potoID;
    }

    public void setPotoID(String potoID) {
        this.potoID = potoID;
    }

    public String getId() {
        return id;
    }
    public String getCommenterId() {
        return commenterId;
    }

    public String getCommenterUserName() {
        return commenterUserName;
    }

    public void setCommenterUserName(String commenterUserName) {
        this.commenterUserName = commenterUserName;
    }

    public Date getCreated() {
        if (creat == null) {
            try {
                sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
                return creat = sdf.parse(created);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return creat;
    }

    public String getText() {
        return text;
    }

    public Boolean getIsSocial() {
        return isSocial;
    }

    public Comment(String text, boolean isSocial) {

        this.text = text;
        this.created=null;
        this.id=null;
        this.isSocial = isSocial;

    }



    @Override
    public String toString() {

        return this.getText() + " " + this.getId();
    }


}
