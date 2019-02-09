package com.nscorp.cost.calculator.db;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Builder
@Embeddable
public class MktgCarTypeId implements Serializable {
    @Column(name = "MARKETING_CAR_TYPE")
    private String marketingCarType;

    @Column(name = "CAR_OWNER")
    private String carOwner;
}
