package com.dhsoftware.treinamentodelayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.sax.StartElementListener;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.dhsoftware.treinamentodelayout.util.MoneyTextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;


public class ExemploTelaCadastroFragment extends Fragment {

    private TextInputLayout textInputLayoutCampoNome;
    private View view;
    AutoCompleteTextView autoCompleteTextViewEstados;

    public ExemploTelaCadastroFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return view = inflater.inflate(R.layout.fragment_exemplo_tela_cadastro, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.estados));
        autoCompleteTextViewEstados = view.findViewById(R.id.auto_complete_estados);
        autoCompleteTextViewEstados.setAdapter(adapter);

        EditText editTextTelefone = view.findViewById(R.id.et_telefone);
        editTextTelefone.addTextChangedListener(new PhoneNumberFormattingTextWatcher("BR"));

        EditText editTextValor = view.findViewById(R.id.et_money);
        editTextValor.addTextChangedListener(new MoneyTextWatcher(editTextValor));
    }

    public void focus(){
        EditText editText = textInputLayoutCampoNome.getEditText();
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                //Para setar erro
                //colocar um if e ver só quando não tem mais o foco para melhorar ui

                //Error no editText
                editText.setError("teste");

                //Erro pelo textInputLayout (Que no caso deixa o visual do erro diferente) sendo melhor utilizado, mas no caso preciso usar o setErrorEnabled para tirar e colocar null no erro
                textInputLayoutCampoNome.setError("Teste");
                //textInputLayoutCampoNome.setErrorEnabled(false);
                //textInputLayoutCampoNome.setError(null);

            }
        });
    }
}