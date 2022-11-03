package br.com.io.github.application.validator;

import br.com.io.github.application.validator.carddata.CardDataValidation;
import br.com.io.github.application.validator.carddata.FieldErrorValidation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ValidatorFields {
    public List<FieldErrorValidation> validate(CardDataValidation build) {

        List<FieldErrorValidation> list = new ArrayList<>();

        //TODO create validations

        return list;
    }
}
