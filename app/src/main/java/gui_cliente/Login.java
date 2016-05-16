package gui_cliente;

/**
 * Created by JohanSZ on 13/05/2016.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ingsoftware.la10uniformes_ingsoft.R;

public class Login extends AppCompatActivity{
    Button ingresar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_cliente);

        ingresar=(Button)findViewById(R.id.ingresarBtn);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresar= new Intent(Login.this, inicioCliente.class);
                startActivity(ingresar);

            }
        });


    }


}
