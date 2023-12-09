package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*

@Entity
@Table(name = "card")
open class Card(cardId: Long?, c: Char, c1: Char) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

     @Column(name = "phone", nullable = false)
    open var phone: String? = null
        protected set

    @Column(name = "email", nullable = false)
    open var email: String? = null
        protected set


    @ManyToOne(cascade = [CascadeType.REMOVE], optional = false)
    @JoinColumn(name = "location_id", nullable = false)
    open var location: Location? = null
        protected set

    @OneToMany(mappedBy = "card", orphanRemoval = true)
    open var companies: MutableSet<Company> = mutableSetOf()
            protected set

    @OneToOne(mappedBy = "card", orphanRemoval = true)
    open var user: User? = null
}
