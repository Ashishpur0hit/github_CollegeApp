package com.example.collegeapp;

public class PostModel {
    String PostImage , Caption, Profile , Name , Institute ;
    public PostModel()
    {

    }

    public PostModel(String postImage, String caption, String profile, String name, String Institute) {
        PostImage = postImage;
        Caption = caption;
        Profile = profile;
        Name = name;
        this.Institute = Institute;
    }

    public String getPostImage() {
        return PostImage;
    }

    public void setPostImage(String postImage) {
        PostImage = postImage;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String caption) {
        Caption = caption;
    }

    public String getProfile() {
        return Profile;
    }

    public void setProfile(String profile) {
        Profile = profile;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getInstitute() {
        return Institute;
    }

    public void setInstitute(String institute) {
        Institute = institute;
    }
}
