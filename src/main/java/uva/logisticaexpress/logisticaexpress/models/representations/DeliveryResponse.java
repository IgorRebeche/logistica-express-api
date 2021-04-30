package uva.logisticaexpress.logisticaexpress.models.representations;

import lombok.AllArgsConstructor;
import uva.logisticaexpress.logisticaexpress.models.Delivery;

@AllArgsConstructor
public class DeliveryResponse {
    Delivery delivery;
    String extraInformation;

}
