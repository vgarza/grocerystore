package com.cs422.grocerystore.model.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexanderlerma on 12/4/16.
 */
public enum OrderStatus {
    @SerializedName("issued")
    ISSUED,
    @SerializedName("sent")
    SENT,
    @SerializedName("received")
    RECEIVED
}
