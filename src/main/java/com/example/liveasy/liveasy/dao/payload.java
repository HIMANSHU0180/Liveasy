package com.example.liveasy.liveasy.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class payload {
      @Id
      @GeneratedValue(strategy =GenerationType.AUTO)
      private long loadId;
      private String loadingPoint;
      private String unloadingPoint;
      private String productType;
      private String truckType;
      private int numberOfTrucks;
      private int weight;
      private String shipperId;
      private String date;
  


    public long getLoadId() {
        return loadId;
    }
    public void setLoadId(long loadId) {
        this.loadId = loadId;
    }
    public String getLoadingPoint() {
        return loadingPoint;
    }
    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }
    public String getUnloadingPoint() {
        return unloadingPoint;
    }
    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }
    public String getTruckType() {
        return truckType;
    }
    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }
    public int getNumberOfTrucks() {
        return numberOfTrucks;
    }
    public void setNumberOfTrucks(int numberOfTrucks) {
        this.numberOfTrucks = numberOfTrucks;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getShipperId() {
        return shipperId;
    }
    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
   

    

}
