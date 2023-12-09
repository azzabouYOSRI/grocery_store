package yosriaz.grocery.grocery_store.data.dto

import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Card}
 */
data class CardDto(
    val id: Long? = null,
    val phone: String? = null,
    val email: String? = null,
) : Serializable
