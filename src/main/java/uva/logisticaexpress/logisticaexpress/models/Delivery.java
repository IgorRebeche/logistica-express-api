package uva.logisticaexpress.logisticaexpress.models;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import uva.logisticaexpress.logisticaexpress.models.enums.DeliveryStatus;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
public class Delivery {
    DeliveryStatus deliveryStatus;
    Instant createdDate;
    String address;
}