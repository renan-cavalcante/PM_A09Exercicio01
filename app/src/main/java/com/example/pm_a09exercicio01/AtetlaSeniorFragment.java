package com.example.pm_a09exercicio01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pm_a09exercicio01.model.AtetlaPleno;
import com.example.pm_a09exercicio01.model.AtetlaSenior;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class AtetlaSeniorFragment extends Fragment {

    private View view;

    private CheckBox cbCardiaco;
    private EditText etNome;
    private EditText etDataNasc;
    private EditText etBairro;
    private Button btnCadastraSenior;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atetla_senior, container, false);

        etNome = view.findViewById(R.id.etNomeS);
        etDataNasc = view.findViewById(R.id.etDataNascS);
        etBairro = view.findViewById(R.id.etBairroS);
        cbCardiaco = view.findViewById(R.id.cbCardiaco);
        btnCadastraSenior = view.findViewById(R.id.btnCadastraSenior);
        btnCadastraSenior.setOnClickListener(op -> cadastrar());
        return view;
    }

    private void cadastrar() {
        AtetlaSenior ap = new AtetlaSenior();
        ap.setNome(etNome.getText().toString());
        ap.setBairro(etBairro.getText().toString());
        ap.setDataNasc(LocalDate.parse(etDataNasc.getText().toString(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        ap.setProblemaCardiaco(cbCardiaco.isChecked());
        limpar();
        Toast.makeText(view.getContext(),ap.toString(), Toast.LENGTH_LONG).show();
    }

    private void limpar() {
        etBairro.setText("");
        etNome.setText("");
        etDataNasc.setText("");
        cbCardiaco.setChecked(false);
    }
}