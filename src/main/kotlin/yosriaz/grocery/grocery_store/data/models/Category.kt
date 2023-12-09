package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*

@Entity
@Table(name = "category")
open class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @Column(name = "name")
    open var name: String? = null

    @OneToMany(mappedBy = "category", orphanRemoval = true)
    open var stocks: MutableSet<Stock> = mutableSetOf()
}
