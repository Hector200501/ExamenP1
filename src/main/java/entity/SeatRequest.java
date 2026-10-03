package entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class SeatRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private Long tripId;


    @Column(nullable = false)
    private Long passengerId;

    @Column(nullable = false)
    private ZonedDateTime requestedAd;

    @Column(nullable = false)
    private String status;
}
