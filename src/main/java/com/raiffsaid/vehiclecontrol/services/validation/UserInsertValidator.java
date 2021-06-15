package com.raiffsaid.vehiclecontrol.services.validation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.raiffsaid.vehiclecontrol.dto.UserDTO;
import com.raiffsaid.vehiclecontrol.entities.User;
import com.raiffsaid.vehiclecontrol.repositories.UserRepository;
import com.raiffsaid.vehiclecontrol.resources.exceptions.FieldMessage;

public class UserInsertValidator implements ConstraintValidator<UserInsertValid, UserDTO> {

    @Autowired
    private UserRepository repository;

    @Override
    public void initialize(UserInsertValid ann){
    }

    // Testa se o objeto userDTO será válido ou não
    @Override
    public boolean isValid(UserDTO dto, ConstraintValidatorContext context) {

        List<FieldMessage> list = new ArrayList<>();

        User userEmail = repository.findByEmail(dto.getEmail());
        if (userEmail != null) {
            list.add(new FieldMessage("email", "Email já cadastrado"));
        }
        User userCpf = repository.findByCpf(dto.getCpf());
        if (userCpf != null) {
            list.add(new FieldMessage("cpf", "CPF já cadastrado"));
        }

        // Percorre a lista do fieldMessage e insere o erro na lista de erros do Beans Validation
        for (FieldMessage fieldMessage : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(fieldMessage.getMessage())
                    .addPropertyNode(fieldMessage.getFieldName())
                    .addConstraintViolation();
        }

        return list.isEmpty();
    }
}
