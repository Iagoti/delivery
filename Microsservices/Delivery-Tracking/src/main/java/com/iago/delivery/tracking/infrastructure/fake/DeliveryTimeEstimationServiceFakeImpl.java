package com.iago.delivery.tracking.infrastructure.fake;

import com.iago.delivery.tracking.domain.model.ContactPoint;
import com.iago.delivery.tracking.domain.service.DeliveryEstimate;
import com.iago.delivery.tracking.domain.service.DeliveryTimeEstimationService;
import org.springframework.stereotype.Service;
import java.time.Duration;

@Service
public class DeliveryTimeEstimationServiceFakeImpl implements DeliveryTimeEstimationService {
    @Override
    public DeliveryEstimate estimate(ContactPoint sender, ContactPoint receiver) {
        return new DeliveryEstimate(
                Duration.ofHours(3),
                3.1
        );
    }
}
