package com.vladimirarreola.fragmentsvlad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout

//Vladimir Arreola
class MainActivity : AppCompatActivity() {
    //Declaracion
    lateinit var textInputNombre:TextInputLayout
    lateinit var editTextApellido:EditText
    lateinit var  btnEnviar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializar por lo que encontremos en el id
        textInputNombre = findViewById(R.id.tILNombre)
        editTextApellido = findViewById(R.id.etApellido)
        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener{
            val apellido = editTextApellido.text.toString()
            val nombre = textInputNombre.editText!!.text.toString()
            //Log.i("datos",  "Datos ingresados: $nombre $apellido")

            val i = Intent(this, SegundaActivity::class.java)

            i.putExtra("name", nombre)
            i.putExtra("lastname", apellido)
            startActivity(i)


        }
    }
}