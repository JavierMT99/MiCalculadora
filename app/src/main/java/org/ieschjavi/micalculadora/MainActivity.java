package org.ieschjavi.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Toast;

import org.ieschjavi.micalculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sum.setOnClickListener(v ->{
            String numero1 = binding.etNumero1.getText().toString();
            String numero2 = binding.etNumero2.getText().toString();

            if(!numero1.isEmpty() && !numero2.isEmpty()){
                double numero1Double = Double.parseDouble(numero1);
                double numero2Double = Double.parseDouble(numero2);
                double resultado = numero1Double + numero2Double;

                binding.tvRespuesta.setText(Double.toString(resultado));
            }
            else{
                if(numero1.isEmpty() && numero2.isEmpty()){
                    Toast.makeText(this, getString(R.string.no_nums), Toast.LENGTH_LONG).show();
                }else{
                    if(numero1.isEmpty()){
                        Toast.makeText(this, getString(R.string.no_num_1), Toast.LENGTH_LONG).show();
                    }
                    else if(numero2.isEmpty()){
                        Toast.makeText(this, getString(R.string.no_num_2), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        binding.rest.setOnClickListener(v ->{
            String numero1 = binding.etNumero1.getText().toString();
            String numero2 = binding.etNumero2.getText().toString();

            if(!numero1.isEmpty() && !numero2.isEmpty()){
                double numero1Double = Double.parseDouble(numero1);
                double numero2Double = Double.parseDouble(numero2);
                double resultado = numero1Double - numero2Double;

                binding.tvRespuesta.setText(Double.toString(resultado));
            }
            else{
                if(numero1.isEmpty() && numero2.isEmpty()){
                    Toast.makeText(this, getString(R.string.no_nums), Toast.LENGTH_LONG).show();
                }else{
                    if(numero1.isEmpty()){
                        Toast.makeText(this, getString(R.string.no_num_1), Toast.LENGTH_LONG).show();
                    }
                    else if(numero2.isEmpty()){
                        Toast.makeText(this, getString(R.string.no_num_2), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        binding.mult.setOnClickListener(v ->{
            String numero1 = binding.etNumero1.getText().toString();
            String numero2 = binding.etNumero2.getText().toString();

            if(!numero1.isEmpty() && !numero2.isEmpty()){
                double numero1Double = Double.parseDouble(numero1);
                double numero2Double = Double.parseDouble(numero2);
                double resultado = numero1Double * numero2Double;

                binding.tvRespuesta.setText(Double.toString(resultado));
            }
            else{
                if(numero1.isEmpty() && numero2.isEmpty()){
                    Toast.makeText(this, getString(R.string.no_nums), Toast.LENGTH_LONG).show();
                }else{
                    if(numero1.isEmpty()){
                        Toast.makeText(this, getString(R.string.no_num_1), Toast.LENGTH_LONG).show();
                    }
                    else if(numero2.isEmpty()){
                        Toast.makeText(this, getString(R.string.no_num_2), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        binding.div.setOnClickListener(v ->{
            String numero1 = binding.etNumero1.getText().toString();
            String numero2 = binding.etNumero2.getText().toString();

            if(!numero1.isEmpty() && !numero2.isEmpty()){
                double numero1Double = Double.parseDouble(numero1);
                double numero2Double = Double.parseDouble(numero2);
                double resultado = numero1Double / numero2Double;

                binding.tvRespuesta.setText(Double.toString(resultado));
            }
            else{
                if(numero1.isEmpty() && numero2.isEmpty()){
                    Toast.makeText(this, getString(R.string.no_nums), Toast.LENGTH_LONG).show();
                }else{
                    if(numero1.isEmpty()){
                        Toast.makeText(this, getString(R.string.no_num_1), Toast.LENGTH_LONG).show();
                    }
                    else if(numero2.isEmpty()){
                        Toast.makeText(this, getString(R.string.no_num_2), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }


}