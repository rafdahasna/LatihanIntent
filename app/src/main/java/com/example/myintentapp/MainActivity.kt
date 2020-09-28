package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tvResult: TextView
    companion object {
        private const val REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveForResult:Button = findViewById(R.id.btn_move_for_result)
        btnMoveForResult.setOnClickListener(this)
        tvResult = findViewById(R.id.tv_result);
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}

override fun onClick(v: View) {
    when (v.id) {
            ...
            R.id.btn_move_for_result -> {
        val moveForResultIntent = Intent(this@MainActivity, MoveForResultActivity::class.java)
        startActivityForResult(moveForResultIntent, REQUEST_CODE)
    }
    }
}

override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    if (requestCode == REQUEST_CODE) {
        if (resultCode == MoveForResultActivity.RESULT_CODE) {
            val selectedValue = data?.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0)
            tv_result.text = "Hasil : $selectedValue"
        }
    }
}

       