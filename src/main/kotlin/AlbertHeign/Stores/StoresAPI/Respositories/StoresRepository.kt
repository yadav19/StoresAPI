package AlbertHeign.Stores.StoresAPI.Respositories

import AlbertHeign.Stores.StoresAPI.Models.Stores
import org.springframework.data.mongodb.repository.MongoRepository

interface StoresRepository: MongoRepository<Stores, String> {
}