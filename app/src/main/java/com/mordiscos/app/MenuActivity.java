package com.mordiscos.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnCalcularCombo = findViewById(R.id.btnCalcularCombo);
        TextView tvTotalPedido = findViewById(R.id.tvTotalPedido);

        btnCalcularCombo.setOnClickListener(v -> {
            CalculadoraPedido calculadora = new CalculadoraPedido();
            int total = calculadora.calcularTotal(15000, 6000);
            tvTotalPedido.setText("Total: $" + total);
        });
    }
}