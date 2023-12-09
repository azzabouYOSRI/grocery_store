package yosriaz.grocery.grocery_store.data.dto

import lombok.Data
import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.ActualStock}
 */
@Data
data class ActualStockDto(val id: Long? = null, val actualStock: Int? = null, val stockId: Long? = null) : Serializable
