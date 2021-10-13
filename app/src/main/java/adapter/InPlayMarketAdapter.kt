package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artikov.modul_5_lesson_4_1.R
import kotlinx.android.synthetic.main.item_in_play_market.view.*
import models.Program

class InPlayMarketAdapter(var appList:List<Program>):RecyclerView.Adapter<InPlayMarketAdapter.Vh>() {

    inner class Vh(itemView: View):RecyclerView.ViewHolder(itemView){
        fun onBind(program: Program){
            itemView.app_name.text = program.appName
            program.imgURL?.let { itemView.image.setImageResource(it) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_in_play_market,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(appList[position])
    }

    override fun getItemCount(): Int = appList.size

}