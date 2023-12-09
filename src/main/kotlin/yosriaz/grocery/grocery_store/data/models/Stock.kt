package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*

@Entity
@Table(name = "stock")
open class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @OneToOne(mappedBy = "stock", cascade = [CascadeType.ALL], optional = false, orphanRemoval = true)
    open var actualStock: ActualStock? = null
        protected set

    @ManyToOne(cascade = [CascadeType.REMOVE], optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    open var category: Category? = null
        protected set

    @ManyToOne(cascade = [CascadeType.REMOVE], optional = false)
    @JoinColumn(name = "invoice_id", nullable = false)
    open var invoice: Invoice? = null
        protected set


    @ManyToOne(cascade = [CascadeType.REMOVE], optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    open var company: Company? = null
        protected set

    @ManyToOne(cascade = [CascadeType.REMOVE], optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    open var user: User? = null
        protected set
}
