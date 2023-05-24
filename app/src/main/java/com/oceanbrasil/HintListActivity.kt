package com.oceanbrasil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oceanbrasil.database.AppDatabase
import com.oceanbrasil.database.HintEntily
import com.oceanbrasil.ocean_jornada_android_maio_2023.R

class HintListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hint_list)

        val hintEntily = HintEntily(1, "Brigadeiro", 10.0, 70.0)

        val appDatabase = AppDatabase.getInstance(this)
        val hintDao = appDatabase.hintDao()

        //Iniciamos uma Thread Nova
        Thread {
            //Executamos operações fora da Main Thread
            hintDao.insert(hintEntily)
            val hintsEntities = hintDao.findAll()

            runOnUiThread {
                //Pegar Referencias da REcyclerView
                val rvHints = findViewById<RecyclerView>(R.id.rvHints)

                // Inicializar LayoutManager
                val layoutManager = LinearLayoutManager(this)
                rvHints.layoutManager = layoutManager

                //Inicializar Adapter (Precisamos criar Adapter)
                // TODO: Substituir listOf pela chamada
                val hintsList = listOf(
                    Hint(1, "Brigadeiro", 10.0, 10.0),
                    Hint(2, "Trianon Masp", 10.0, 10.0),
                    Hint(3, "Paraiso", 10.0, 10.0)
                )

                val adapter = HintsListAdapter(hintsList)
                rvHints.adapter = adapter
            }
        }.start()
    }
}
