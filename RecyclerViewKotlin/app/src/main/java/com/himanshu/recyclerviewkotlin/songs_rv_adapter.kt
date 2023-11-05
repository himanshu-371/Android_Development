package layout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.himanshu.recyclerviewkotlin.R
import com.himanshu.recyclerviewkotlin.songs

class songs_rv_adapter(val songs: List<songs>): RecyclerView.Adapter<songs_rv_adapter.songsViewHolder>() {

    inner class songsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.textView)
        val textView2: TextView = itemView.findViewById(R.id.textView2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): songsViewHolder {
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return songsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: songsViewHolder, position: Int) {
        holder.textView.text = songs[position].title
        holder.textView2.text = songs[position].description
    }

}