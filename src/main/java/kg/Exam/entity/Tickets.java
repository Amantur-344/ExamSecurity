package kg.Exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tickets")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "code_id",nullable = false)
    private Integer code;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "link_site",nullable = false)
    private String linkSite;
    @Column(name = "payment_methods", nullable = false)
    private String paymentMethods;
    @Column(name = "local_date_time",nullable = false)
    private LocalDateTime localDateTime;

    public Tickets(String name, String linkSite, String paymentMethods) {
        this.name = name;
        this.linkSite = linkSite;
        this.paymentMethods = paymentMethods;
    }
}
