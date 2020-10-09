package id.phb.tantangan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNumber1 = findViewById<EditText>(R.id.edtAngka1)
        val txtNumber2 = findViewById<EditText>(R.id.edtAngka2)
        val txtNumber3 = findViewById<EditText>(R.id.edtAngka3)
        val txtHasil = findViewById<EditText>(R.id.edtHasil)

        val btnKurang = findViewById<Button>(R.id.btnKurang)
        val btnBagi = findViewById<Button>(R.id.btnBagi)
        val btnKali = findViewById<Button>(R.id.btnKali)


        btnKurang.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty() || txtNumber3.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = txtNumber3.text.toString().toDouble()
                val d = this.kurang(a, b, c)
                txtHasil.setText(d.toString())
            }
        }

        btnBagi.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty() || txtNumber3.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = txtNumber3.text.toString().toDouble()
                val d = this.bagi(a, b, c)
                txtHasil.setText(d.toString())
            }
        }

        btnKali.setOnClickListener {
            if (txtNumber1.text.toString().isEmpty() || txtNumber2.text.toString().isEmpty() || txtNumber3.text.toString().isEmpty()) {
                txtNumber1.setError("Semua input harus diisi!")
            } else {
                val a = txtNumber1.text.toString().toDouble()
                val b = txtNumber2.text.toString().toDouble()
                val c = txtNumber3.text.toString().toDouble()
                val d = this.kali(a, b, c)
                txtHasil.setText(d.toString())
            }
        }
        btnKeluar.setOnClickListener {
            finish()
            System.exit(0)
        }
    }

    fun kurang(a: Double, b: Double, c: Double): Double {
        return a - b - c
    }

    fun kali(a: Double, b: Double, c: Double): Double {
        return a * b * c
    }

    fun bagi(a: Double, b: Double, c: Double): Double {
        return a / b / c
    }
}
