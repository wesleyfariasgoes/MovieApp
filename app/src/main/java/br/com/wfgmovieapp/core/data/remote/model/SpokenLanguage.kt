package br.com.wfgmovieapp.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class SpokenLanguage(
    @SerializedName("english_name") val english_name: String,
    @SerializedName("iso_639_1") val isoLanguage: String,
    @SerializedName("name") val name: String
)