package com.young.streaming.model.result.mux

import com.google.gson.annotations.SerializedName

data class PlaybackIds(
    @SerializedName("policy")
    val policy: String,
    @SerializedName("id")
    val id: String,
)