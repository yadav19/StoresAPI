package AlbertHeign.Stores.StoresAPI.Models

import org.springframework.data.mongodb.core.mapping.Document

//@Document(collection = "StoreAddressDetails")
data class AddressPeriod(
    var dateValidFrom: String,
    var dateValidUntil: String?,
    var storeAddress: StoreAddress
)
