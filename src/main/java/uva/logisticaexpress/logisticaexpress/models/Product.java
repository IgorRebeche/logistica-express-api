package uva.logisticaexpress.logisticaexpress.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import uva.logisticaexpress.logisticaexpress.models.enums.ProductGroup;

@Data
@AllArgsConstructor
public class Product {
    String name;
    String weight;
    ProductGroup group;
}
