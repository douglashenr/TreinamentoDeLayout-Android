package com.dhsoftware.treinamentodelayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ExemploTelaCadastro extends Fragment {

    private View view;
    AutoCompleteTextView autoCompleteTextViewEstados;

    public ExemploTelaCadastro() {
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
    }
}