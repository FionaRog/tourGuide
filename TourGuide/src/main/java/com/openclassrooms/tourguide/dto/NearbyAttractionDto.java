package com.openclassrooms.tourguide.dto;


public class NearbyAttractionDto {

    private String attractionName;
    private double attractionLatitude;
    private double attractionLongitude;
    private double userLatitude;
    private double userLongitude;
    private double distanceMiles;
    private int rewardsPoints;

    public String getAttractionName() {return attractionName;}
    public void setAttractionName(String attractionName) {this.attractionName = attractionName;}

    public double getAttractionLatitude() {return attractionLatitude;}
    public void setAttractionLatitude(double attractionLatitude) {this.attractionLatitude = attractionLatitude;}

    public double getAttractionLongitude() {return attractionLongitude;}
    public void setAttractionLongitude(double attractionLongitude) {this.attractionLongitude = attractionLongitude;}

    public double getUserLatitude() {return userLatitude;}
    public void setUserLatitude(double userLatitude) {this.userLatitude = userLatitude;}

    public double getUserLongitude() {return userLongitude;}
    public void setUserLongitude(double userLongitude) {this.userLongitude = userLongitude;}

    public double getDistanceMiles() {return distanceMiles;}
    public void setDistanceMiles(double distanceMiles) {this.distanceMiles = distanceMiles;}

    public int getRewardsPoints() {return rewardsPoints;}
    public void setRewardsPoints(int rewardsPoints) {this.rewardsPoints = rewardsPoints;}
}
