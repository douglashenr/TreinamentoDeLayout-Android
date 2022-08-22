package com.dhsoftware.treinamentodelayout;

public class FormatarCelularTelefone {


    //regex para encontrar padrões
    public String devolveTelefoneComDDDFormatado(String telefone){
        //O Simbolo '$' é usado para indicar cada regex entre parenteses e o '4,5' significa que o minimo e o maximo de padrão é de 4 a 5
        //dessa forma atende aos padrões de celular e telefone com ddd (respectivamente 11 e 10 digitos)
        String telefoneFormatado = telefone.replaceAll("([0-9]{2}) ([0-9]{4,5}) ([0-9]{4})", "($1) $2-$3");
        return telefone;
    }

    public String devolveTelefoneSemFormatação(String telefoneFormatado){
        return telefoneFormatado.replace("(", "")
                .replace(")", "")
                .replace("-", "")
                .replace(" ", "");
    }
}
