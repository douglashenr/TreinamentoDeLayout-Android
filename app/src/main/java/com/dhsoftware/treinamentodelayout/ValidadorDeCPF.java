package com.dhsoftware.treinamentodelayout;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidadorDeCPF {

    public boolean validarCPF(String cpf) {
        CPFValidator cpfValidator = new CPFValidator();

        try {
            cpfValidator.assertValid(cpf);
        } catch (InvalidStateException e) {
            e.getInvalidMessages();
            return false;
        }


        return true;
    }

    public String formatarCPF(String cpf){
        CPFFormatter cpfFormatter = new CPFFormatter();
        try {
            String cpfFormatado = cpfFormatter.format(cpf);
            return cpfFormatado;
        }catch (IllegalArgumentException e){
            e.getMessage();
            return null;
        }
    }
}
