package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.LocationDto
import yosriaz.grocery.grocery_store.data.models.Location

interface ILocationMapper {
    fun mapToDto(location: Location): LocationDto

    fun mapToEntity(locationDto: LocationDto): Location
}
