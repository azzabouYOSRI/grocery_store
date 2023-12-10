package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.StockDto
import yosriaz.grocery.grocery_store.data.models.Stock

interface IStockMapper {
      fun mapToDto(stock: Stock): StockDto

    fun mapToEntity(stockDto: StockDto): Stock
}
