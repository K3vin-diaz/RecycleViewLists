package diaz.hurtado.recycleviewlist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val peliculas = listOf(
            Pelicula(R.drawable.guardianes, "Guardianes de la galaxia", "Esto es una descripcion para la pelicula guardianes de la galaxia"),
            Pelicula(R.drawable.lordward, "Lord War", "Esto es una descripcion para la pelicula Lord War"),
            Pelicula(R.drawable.movie, "Guardianes de la galaxia", "Esto es una descripcion para la pelicula guardianes de la galaxia")


        )

        val  recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.lista_view)
        recycler_peliculas.layoutManager = LinearLayoutManager(this)
        recycler_peliculas.adapter = AdaptadorPeliculas(peliculas)




    }
    }
