package com.example.putatoecategory;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Parent {
    @SerializedName("error")
    private String error;

    @SerializedName("product_type")
    private Map<String, List<childmodelClass>> productType;

    @SerializedName("service_id")
    private int serviceId;

    @SerializedName("service_name")
    private String serviceName;

    @SerializedName("status")
    private boolean status;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Map<String, List<childmodelClass>> getProductType() {
        return productType;
    }

    public void setProductType(Map<String, List<childmodelClass>> productType) {
        this.productType = productType;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
