package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*

@Entity
@Table(name = "product")
open class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @Column(name = "label", nullable = false)
    open var label: String? = null

    @Column(name = "description")
    open var description: String? = null

    @Column(name = "price_ht", nullable = false)
    open var priceHT: Double ? = null

    @OneToMany(mappedBy = "product", orphanRemoval = true)
    open var stocks: MutableSet<Stock> = mutableSetOf()
}
