package AlbertHeign.Stores.StoresAPI.Controllers

import AlbertHeign.Stores.StoresAPI.Models.Stores
import AlbertHeign.Stores.StoresAPI.Respositories.StoresRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/store-service/v1/")
class StoresController (private val storesRepo: StoresRepository) {

    @GetMapping("/stores")
    fun getAllStores(): ResponseEntity<List<Stores>>{
        return ResponseEntity.ok(storesRepo.findAll().orEmpty())
    }

    @GetMapping("/stores/{storeId}")
    fun getStore(@PathVariable storeId: String): ResponseEntity<Stores>{
        return ResponseEntity.ok(storesRepo.findById(storeId).orElse(null))
    }
    @PostMapping("/persiststore")
    fun saveStore(@RequestBody store: Stores ): ResponseEntity<String>{
        storesRepo.save(store)
        print(store)
        return ResponseEntity.ok("Saved")
    }
}