package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artikov.modul_5_lesson_4_1.R
import kotlinx.android.synthetic.main.item_play_market.view.*
import models.GeneralData

class PlayMarketAdapter(var generalList:List<GeneralData>):RecyclerView.Adapter<PlayMarketAdapter.Vh>() {

    inner class Vh(itemView: View):RecyclerView.ViewHolder(itemView){

        fun onBind(generalData: GeneralData){
            itemView.title_tv.text = generalData.title
            val inPlayMarketAdapter = InPlayMarketAdapter(generalData.appList!!)
            itemView.rv_inside.adapter = inPlayMarketAdapter
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_play_market,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(generalList[position])
    }

    override fun getItemCount(): Int = generalList.size

}