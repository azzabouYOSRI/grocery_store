package yosriaz.grocery.grocery_store.data.dto

import lombok.Data
import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Card}
 */
@Data
data class CardDto(
    val id: Long? = null,
    val phone: String? = null,
    val email: String? = null,
) : Serializable
