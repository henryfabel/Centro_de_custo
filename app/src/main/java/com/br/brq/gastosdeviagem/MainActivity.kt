package com.br.brq.gastosdeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//private fun Any.div(autonomia: EditText): Any {}
//private operator fun EditText.times(preco: EditText): Any {}
//class MainActivity : AppCompatActivity() {
//    lateinit var btnCalcular: Button
//    lateinit var distancia: EditText
//    lateinit var preco: EditText
//    lateinit var autonomia: EditText
//    lateinit var resultado1: TextView
//
//    fun carregarElemento() {
//        btnCalcular = findViewById(R.id.buttonCalcular)
//        distancia = findViewById(R.id.distanciaTotal)
//        preco = findViewById(R.id.precoR)
//        autonomia = findViewById(R.id.autonomiaTotal)
//        resultado1 = findViewById(R.id.totalResultado)}
//
//    fun carregarEvento() {
//        btnCalcular.setOnClickListener() {
//            val resultadobtn = resultado1
//            if (resultado1 == btnCalcular) {
//                calcular(startActivity(resultado1))
//            }
//        }
//    }
//    private fun calcular() {
//        val resultado = (distancia * preco).div(autonomia)
//    }

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.buttonCalcular) {
            calcular()
        }
    }

    private fun calcular() {

        val distance = distanciaTotal.text.toString().toFloat()
        val price = precoR.text.toString().toFloat()
        val autonomy = autonomiaTotal.text.toString().toFloat()

        val valorTotal = (distance * price) / autonomy
        totalResultado.text = "R$ ${"%.2f".format(valorTotal)}"

    }
}