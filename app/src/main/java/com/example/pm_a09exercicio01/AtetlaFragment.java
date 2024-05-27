package com.example.pm_a09exercicio01;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pm_a09exercicio01.model.AtetlaPleno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class AtetlaFragment extends Fragment {

    private View view;

    private EditText etAcademia;
    private EditText etRecord;
    private EditText etNome;
    private EditText etDataNasc;
    private EditText etBairro;
    private Button btnCadastraPleno;

    public AtetlaFragment(){
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atetla, container, false);
        etAcademia = view.findViewById(R.id.etAcademia);
        etRecord = view.findViewById(R.id.etRecord);
        etNome = view.findViewById(R.id.etNome);
        etDataNasc = view.findViewById(R.id.etDtaNasc);
        etBairro = view.findViewById(R.id.etBairro);
        btnCadastraPleno = view.findViewById(R.id.btnCadastraPleno);
        btnCadastraPleno.setOnClickListener(op -> cadastrar());
        return view;
    }

    private void cadastrar() {
        AtetlaPleno ap = new AtetlaPleno();
        ap.setNome(etNome.getText().toString());
        ap.setBairro(etBairro.getText().toString());
        ap.setDataNasc(LocalDate.parse(etDataNasc.getText().toString(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        ap.setAcademia(etAcademia.getText().toString());
        ap.setRecord(Float.parseFloat(etRecord.getText().toString()));
        limpar();
        Toast.makeText(view.getContext(),ap.toString(), Toast.LENGTH_LONG).show();
    }

    private void limpar() {
        etBairro.setText("");
        etNome.setText("");
        etDataNasc.setText("");
        etRecord.setText("");
        etAcademia.setText("");
    }


}