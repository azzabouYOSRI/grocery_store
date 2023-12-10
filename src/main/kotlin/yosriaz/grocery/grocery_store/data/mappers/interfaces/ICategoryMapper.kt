package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.CategoryDto
import yosriaz.grocery.grocery_store.data.models.Category

interface ICategoryMapper {
      fun mapToDto(category: Category): CategoryDto
    fun mapToEntity(categoryDto: CategoryDto): Category
}
