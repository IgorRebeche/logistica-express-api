package uva.logisticaexpress.logisticaexpress.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uva.logisticaexpress.logisticaexpress.models.Delivery;
import uva.logisticaexpress.logisticaexpress.models.enums.DeliveryStatus;
import uva.logisticaexpress.logisticaexpress.models.representations.DeliveryRequest;
import uva.logisticaexpress.logisticaexpress.models.representations.DeliveryResponse;
import uva.logisticaexpress.logisticaexpress.repository.DeliveryRepository;

import java.time.Instant;

@Service
public class DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;

    private static final Logger log = LoggerFactory.getLogger(DeliveryService.class);

    public DeliveryResponse register(DeliveryRequest deliveryRequest) {
        // Do some logic
        log.info("Registering Delivery");
        try {
            Delivery delivery = new Delivery(DeliveryStatus.APPROVED, Instant.now(), "Endereco");
            deliveryRepository.save(delivery);
            log.info("Saved delivery successfully");

            return new DeliveryResponse(delivery, "Extra Information");

        } catch (Exception e) {
            log.error("Some error ocurred", e);
        }
        return null;
    }
}