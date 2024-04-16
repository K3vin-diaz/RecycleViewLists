package diaz.hurtado.recycleviewlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import diaz.hurtado.recycleviewlist.AdaptadorPeliculas.PeliculasViewHolder

class AdaptadorPeliculas(val peliculas_list: List<Pelicula>): RecyclerView.Adapter<PeliculasViewHolder>() {

    class PeliculaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var imagen_pelicula: ImageView = itemView.findViewById(R.id.imagen_pelicula)
        var titulo: TextView = itemView.findViewById(R.id.titulo_pelicula)
        var desc: TextView = itemView.findViewById(R.id.descripcion_pelicula)
    }

     class PeliculasViewHolder {


     }

     override fun onCreateViewHolder(
         parent: ViewGroup,
         viewType: Int
     ): PeliculasViewHolder {
         val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lista_item,parent, false)
        return PeliculaViewHolder(itemView)
     }

     override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int) {
         val  pelicula: Pelicula = peliculas_list[position]
         holder.imagen_pelicula.setImagenResource(pelicula.imagen)
         holder.titulo.text= pelicula.titulo
         holder.desc.text = pelicula.desc

     }

     override fun getItemCount(): Int {
     return peliculas_list.size
     }

 }