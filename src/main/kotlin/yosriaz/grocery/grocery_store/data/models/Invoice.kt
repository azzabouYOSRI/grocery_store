package yosriaz.grocery.grocery_store.data.models

import jakarta.persistence.*
import yosriaz.grocery.grocery_store.data.enums.InvoiceTarget
import yosriaz.grocery.grocery_store.data.enums.InvoiceType
import java.time.LocalDateTime

@Entity
@Table(name = "invoice")
open class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null
        protected set

    @Column(name = "ht", nullable = false)
    open var ht: Double? = null
        protected set

    @Column(name = "date", nullable = false)
    open var date: LocalDateTime? = null
        protected set

    @ManyToOne(cascade = [CascadeType.REMOVE], optional = false)
    @JoinColumn(name = "location_id", nullable = false)
    open var location: Location? = null
            protected set

    @Enumerated(EnumType.STRING)
    @Column(name = "invoice_target", nullable = false)
    open var invoiceTarget: InvoiceTarget? = null

    @Enumerated(EnumType.STRING)
    @Column(name = "invoice_type", nullable = false)
    open var invoiceType: InvoiceType? = null

    @OneToMany(mappedBy = "invoice", orphanRemoval = true)
    open var stocks: MutableSet<Stock> = mutableSetOf()
}
