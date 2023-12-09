package yosriaz.grocery.grocery_store.data.dto

import lombok.Data
import yosriaz.grocery.grocery_store.data.enums.InvoiceTarget
import yosriaz.grocery.grocery_store.data.enums.InvoiceType
import java.io.Serializable
import java.time.LocalDateTime

/**
 * DTO for {@link yosriaz.grocery.grocery_store.data.dto.Invoice}
 */
@Data
data class InvoiceDto(
    val id: Long? = null,
    val ht: Double? = null,
    val date: LocalDateTime? = null,
    val locationId: Long? = null,
    val invoiceTarget: InvoiceTarget? = null,
    val invoiceType: InvoiceType? = null,
    val stockIds: MutableSet<Long>?
) : Serializable
