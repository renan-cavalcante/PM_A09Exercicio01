package com.example.pm_a09exercicio01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pm_a09exercicio01.model.Atetla;
import com.example.pm_a09exercicio01.model.AtetlaJuvenil;
import com.example.pm_a09exercicio01.model.AtetlaPleno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class AtetlaJuniorFragment extends Fragment {

    private View view;
    private EditText etAnosPatrica;
    private EditText etNome;
    private EditText etDataNasc;
    private EditText etBairro;
    private Button btnCadastraJunior;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_atetla_junior, container, false);
        etNome = view.findViewById(R.id.etNomeAJ);
        etDataNasc = view.findViewById(R.id.etDataNascAJ);
        etBairro = view.findViewById(R.id.etBairroAJ);
        etAnosPatrica = view.findViewById(R.id.etAno);
        btnCadastraJunior = view.findViewById(R.id.btnCadastraJunior);
        btnCadastraJunior.setOnClickListener(op -> cadastrar());
        return view;
    }

    private void cadastrar() {

        AtetlaJuvenil ap = new AtetlaJuvenil();
        ap.setNome(etNome.getText().toString());
        ap.setBairro(etBairro.getText().toString());
        ap.setDataNasc(LocalDate.parse(etDataNasc.getText().toString(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        ap.setAnosPatrica(Integer.parseInt(etAnosPatrica.getText().toString()));
        limpar();
        Toast.makeText(view.getContext(),ap.toString(), Toast.LENGTH_LONG).show();
    }

    private void limpar() {
        etBairro.setText("");
        etNome.setText("");
        etDataNasc.setText("");
        etAnosPatrica.setText("");
    }
}