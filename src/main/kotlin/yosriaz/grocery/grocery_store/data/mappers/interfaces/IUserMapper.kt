package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.UserDto
import yosriaz.grocery.grocery_store.data.models.User

interface IUserMapper {
    fun mapToDto(user: User): UserDto

    fun mapToEntity(userDto: UserDto): User
}
