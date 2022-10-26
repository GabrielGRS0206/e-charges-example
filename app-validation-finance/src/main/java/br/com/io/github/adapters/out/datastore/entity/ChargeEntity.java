package br.com.io.github.adapters.out.datastore.entity;

import br.com.io.github.application.model.Address;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class ChargeEntity {

    @Id
    private String id;
    private String chargeId;
    private String name;
    private String document;
    private String dateBirth;
    private String email;
    private String phone;
    private Address address;
    private String paymentMethod;
    private String amount;
    private String quantityParcels;
}
