package com.onboarding.ecomm.Model.Response;

import com.google.gson.annotations.SerializedName;

public class RequestForAddToCart {
    @SerializedName("quantity")
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
