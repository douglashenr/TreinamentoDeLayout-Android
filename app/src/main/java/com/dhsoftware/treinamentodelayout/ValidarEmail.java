package com.dhsoftware.treinamentodelayout;

public class ValidarEmail {

    public boolean ehUmEmail(String email){
        //a expressao .* significa que eu posso colocar o que eu quiser na quantidade que eu quiser
        // o '//' é para ignorar como expressão regex, fazendo com que ele considere como caractere '.'
        // Pode ser utilizado '.+' que diferente do '.*' obriga a colocar pelo menos um caractere
        return email.matches(".*@.*\\..*");

    }
}
