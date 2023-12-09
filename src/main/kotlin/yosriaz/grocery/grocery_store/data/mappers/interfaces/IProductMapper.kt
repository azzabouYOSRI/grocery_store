package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.ProductDto
import yosriaz.grocery.grocery_store.data.models.Product
interface IProductMapper {
      fun mapToDto(product: Product): ProductDto
    fun mapToEntity(productDto: ProductDto): Product
}
