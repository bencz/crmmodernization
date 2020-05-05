package com.learning.crm.dataclasses.contacts


import com.google.gson.annotations.SerializedName
import com.learning.crm.activities.dataclasses.contacts.Info

data class CrmContacts(
    @SerializedName("data")
    val data: List<Data>,
    @SerializedName("info")
    val info: Info? = null
)