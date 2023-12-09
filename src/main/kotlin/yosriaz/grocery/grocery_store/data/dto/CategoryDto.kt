package yosriaz.grocery.grocery_store.data.dto

import lombok.Data
import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Category}
 */
@Data
data class CategoryDto(val id: Long? = null, val name: String? = null) : Serializable
