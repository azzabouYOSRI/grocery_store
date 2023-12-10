package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.ActualStockDto
import yosriaz.grocery.grocery_store.data.models.ActualStock

interface IActualStockMapper {
      fun mapToDto(actualStock: ActualStock): ActualStockDto
      fun mapToEntity(actualStockDto: ActualStockDto): ActualStock
}
