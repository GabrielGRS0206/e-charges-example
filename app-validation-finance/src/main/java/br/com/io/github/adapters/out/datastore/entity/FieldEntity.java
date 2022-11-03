package br.com.io.github.adapters.out.datastore.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@Builder
public class FieldEntity {

    @Id
    private String id;
    private String chargeId;
    private List<FieldInfo> list;

    @Data
    @Builder
    public class FieldInfo {
        private String field;
        private String message;
    }
}
