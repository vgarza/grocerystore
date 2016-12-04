package com.cs422.grocerystore.model.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexanderlerma on 12/4/16.
 */
public enum AddressType {
    @SerializedName("delivery")
    DELIVERY,
    @SerializedName("payment")
    PAYMENT
}
