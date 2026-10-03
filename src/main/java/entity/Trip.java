package entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable=false)
    private Long routeId;

    @Column  (nullable=false)
    private ZonedDateTime departureTime;

    @Column (nullable=false)
    private Integer capacity;

    @Column (nullable = false)
    private Integer availableSeats;

    @Column (nullable = false)
    private String status;


}
