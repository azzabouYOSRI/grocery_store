package yosriaz.grocery.grocery_store.data.dto

import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Product}
 */
data class ProductDto(
    val id: Long? = null,
    val label: String? = null,
    val description: String? = null,
    val priceHT: Double? = null,
    val stockIds: MutableSet<Long>?
) : Serializable
