package yosriaz.grocery.grocery_store.data.mappers.interfaces

import yosriaz.grocery.grocery_store.data.dto.CardDto
import yosriaz.grocery.grocery_store.data.models.Card

interface ICardMapper {
  fun mapToDto(card: Card): CardDto

  fun mapToEntity(cardDto: CardDto): Card
}
