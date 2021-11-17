package AlbertHeign.Stores.StoresAPI.Models

import org.springframework.data.mongodb.core.mapping.Document

//@Document(collection = "StoreAddressDetails")

data class StoreAddress(
    var street: String,
    var houseNumber: String,
    var houseNumberSuffix: String,
    var postalCode: String,
    var city: String,
    var country: String
)
