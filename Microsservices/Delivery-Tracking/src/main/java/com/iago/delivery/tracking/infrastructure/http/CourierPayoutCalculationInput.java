package com.iago.delivery.tracking.infrastructure.http;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CourierPayoutCalculationInput {
    private Double distanceInKm;
}

