package com.example.pcworld.tourguide;

public class DetailsList {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String title;
    private String description;
    private int imageId = NO_IMAGE_PROVIDED;

    public DetailsList(String tit, String des) {
        title = tit;
        description = des;
    }

    public DetailsList(String tit, String des, int image) {
        title = tit;
        description = des;
        imageId = image;

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    public boolean listWithImageOrNot() {
        if (imageId != NO_IMAGE_PROVIDED) {
            return true;
        } else {
            return false;
        }
    }
}
