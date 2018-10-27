package com.example.android.stempodcast;

public class stemModel {

    private final String modelName;
    private final String modelOccupation;
    private final String modelCity;
    private final int modelImage;

    //Build custom constructor with three Strings and Model passing through variables
    public stemModel(String modelName, String modelOccupation, String modelCity, int modelImage) {
        this.modelName = modelName;
        this.modelOccupation = modelOccupation;
        this.modelCity = modelCity;
        this.modelImage = modelImage;

    }

    //Getting data and putting on other side with method that returns string/int.
    public String getModelName() {
        return modelName;
    }

    public String getModelOccupation() {
        return modelOccupation;
    }

    public String getModelCity() {
        return modelCity;
    }

    public int getModelImage() {
        return modelImage;
    }

}
