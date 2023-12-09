package yosriaz.grocery.grocery_store.data.dto

import lombok.Data
import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Product}
 */
@Data
data class ProductDto(
    val id: Long? = null,
    val label: String? = null,
    val description: String? = null,
    val priceHT: Double? = null,
    val stockIds: MutableSet<Long>?
) : Serializable
