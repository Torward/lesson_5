package ru.lomov.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name="PRODUCT")
@NamedQueries({
        @NamedQuery(name = "Product.findTitleById",
        query = "select p.title from Product p where p.id = :id"),
        @NamedQuery(name = "Product.findById",
        query = "select p from Product p where p.id = :id"),
        @NamedQuery(name = "Product.deleteById",
        query = "delete from Product p where p.id = :id")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "cost")
    private BigDecimal cost;
    @Column(name = "date")
    private LocalDate date;

}
