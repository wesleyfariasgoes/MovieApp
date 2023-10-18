package br.com.wfgmovieapp.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class ProductionCountry(
    @SerializedName("iso_3166_1") val isoCountry: String,
    @SerializedName("idname") val name: String
)