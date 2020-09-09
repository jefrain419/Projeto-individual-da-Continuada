package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularMedia(component:View) {

        if (et_nome.text.toString().equals("")) {
            Toast.makeText(this, "O campo 'Nome' não pode estar vazio!", Toast.LENGTH_SHORT).show()
        } else if (et_nota1.text.toString().equals("")) {
            Toast.makeText(this, "O campo 'Nota 1' não pode estar vazio!", Toast.LENGTH_SHORT)
                .show()
        } else if (et_nota2.text.toString().equals("")) {
            Toast.makeText(this, "O campo 'Nota 2' não pode estar vazio!", Toast.LENGTH_SHORT)
                .show()
        } else {
            val nota1 = et_nota1.text.toString().toDouble()
            val nota2 = et_nota2.text.toString().toDouble()
            val nome = et_nome.text.toString()
            val media = (nota1 + nota2) / 2

            if (nota1 > 10 || nota1 < 0 ) {
                Toast.makeText(this, "'Nota 1' não pode ser maior que 10 ou menor que 0", Toast.LENGTH_SHORT).show()


            } else if (nota2 > 10 || nota2 < 0 ) {
                Toast.makeText(this, "'Nota 2' não pode ser maior que 10 ou menor que 0", Toast.LENGTH_SHORT).show()


            } else if (media < 5) {

                tv_resultado.text = "Média: ${media}  -  ${nome}: Não passou!"
                tv_resultado.setTextColor(Color.RED)
                tv_resultado.visibility = View.VISIBLE

            } else {

                tv_resultado.text = "Média: ${media}  -  ${nome}: Passou!"
                tv_resultado.setTextColor(Color.parseColor("#006400"))
                tv_resultado.visibility = View.VISIBLE

            }


        }


    }
}