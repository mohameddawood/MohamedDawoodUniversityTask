package com.example.network.network

import com.fasterxml.jackson.annotation.JsonProperty
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
data class UniversityItem(
    @SerialName("alpha_two_code") val alphaTwoCode: String = "",
    @SerialName("name") val name: String = "",
    @SerialName("country") val country: String = "",
    @SerialName("domains") val domains: List<String> = listOf(),
    @SerialName("web_pages") val webpages: List<String> = listOf(),
     @JsonProperty("state-province") val `state-province`: String = "UAE"
){

}