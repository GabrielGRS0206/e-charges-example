package br.com.io.github.adapters.out.datastore.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class ResultApiCharge {

    private String message;
    private String status;
}
