package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.InvoiceDto
import yosriaz.grocery.grocery_store.data.models.Invoice

interface IInvoiceMapper {
      fun mapToDto(invoice: Invoice): InvoiceDto
    fun mapToEntity(invoiceDto: InvoiceDto): Invoice
}
