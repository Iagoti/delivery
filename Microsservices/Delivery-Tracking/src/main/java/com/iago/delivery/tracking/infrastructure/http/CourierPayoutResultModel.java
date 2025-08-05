package com.iago.delivery.tracking.infrastructure.http;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class CourierPayoutResultModel {
    private BigDecimal payoutFee;
}
