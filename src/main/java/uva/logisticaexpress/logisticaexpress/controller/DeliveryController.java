package uva.logisticaexpress.logisticaexpress.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uva.logisticaexpress.logisticaexpress.models.representations.DeliveryRequest;
import uva.logisticaexpress.logisticaexpress.models.representations.DeliveryResponse;
import uva.logisticaexpress.logisticaexpress.service.DeliveryService;

@Controller
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @RequestMapping(value = "/register-delivery", method = RequestMethod.GET)
    public ResponseEntity<DeliveryResponse> registerDelivery (@RequestBody DeliveryRequest deliveryRequest) {

        DeliveryResponse deliveryResponse = deliveryService.register(deliveryRequest);

        return new ResponseEntity<>(deliveryResponse, HttpStatus.OK);
    }

    public void refundDelivery () {}

    public void getTrackInfo () {}
}