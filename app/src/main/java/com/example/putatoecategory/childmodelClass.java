package com.example.putatoecategory;

import com.google.gson.annotations.SerializedName;

public class childmodelClass {
    @SerializedName("product_type_image")
    private String image;

    @SerializedName("product_type_name")
    private String name;

    @SerializedName("product_type_discount")
    private int discount;

    @SerializedName("product_type_id")
    private int productTypeId;

    @SerializedName("service_id")
    private int serviceId;

    @SerializedName("service_name")
    private String serviceName;

    @SerializedName("sub_service_id")
    private int subServiceId;

    @SerializedName("sub_service_name")
    private String subServiceName;

    public String getImage() {
        if(image == null){
            return "https://putatoetest.web.app/static/media/imageNotFound.5bf65dcf08208b2e041f.png";
        }
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
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

    public int getSubServiceId() {
        return subServiceId;
    }

    public void setSubServiceId(int subServiceId) {
        this.subServiceId = subServiceId;
    }

    public String getSubServiceName() {
        return subServiceName;
    }

    public void setSubServiceName(String subServiceName) {
        this.subServiceName = subServiceName;
    }

    public childmodelClass(int discount, int productTypeId, String image, String name, int serviceId, String serviceName, int subServiceId, String subServiceName) {
        this.image = image;
        this.name = name;
        this.discount = discount;
        this.productTypeId = productTypeId;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.subServiceId = subServiceId;
        this.subServiceName = subServiceName;
    }
}

