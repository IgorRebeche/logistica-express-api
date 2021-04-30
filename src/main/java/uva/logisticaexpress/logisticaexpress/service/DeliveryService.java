package uva.logisticaexpress.logisticaexpress.service;

import uva.logisticaexpress.logisticaexpress.models.representations.DeliveryRequest;
import uva.logisticaexpress.logisticaexpress.models.representations.DeliveryResponse;

public interface DeliveryService {

    DeliveryResponse register(DeliveryRequest deliveryRequest);

}
