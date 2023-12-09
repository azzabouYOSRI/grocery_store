package yosriaz.grocery.grocery_store.data.dto

import java.io.Serializable

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Stock}
 */
data class StockDto(
    val id: Long? = null,
    val categoryId: Long? = null,
    val invoiceId: Long? = null,
    val companyId: Long? = null,
    val userId: Long? = null,
    val product:Long?=null
) : Serializable
