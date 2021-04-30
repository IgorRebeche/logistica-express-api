package uva.logisticaexpress.logisticaexpress.models.representations;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DeliveryRequest {
    String productName;
    String productWeight;
    String deliveryAddress;
}
