package com.example.opossumgenerator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.opossumgenerator.databinding.OpossumItemBinding

class OpossumAdapter : RecyclerView.Adapter<OpossumAdapter.OpossumHolder>() {

    var opossumList = ArrayList<Opossum>();

    class OpossumHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = OpossumItemBinding.bind(item)

        fun bind(opossum: Opossum) = with (binding){
            imgOpossum.setImageResource(opossum.image)
            opossumName.text = opossum.name
            opossumHeight.text = opossum.height.toString()
            opossumWeight.text = opossum.weight.toString()
            opossumMind.text = opossum.mind.toString()
            opossumStrength.text = opossum.strength.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpossumHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.opossum_item, parent, false);
        return OpossumHolder(view);
    }

    override fun onBindViewHolder(holder: OpossumHolder, position: Int) {
        holder.bind(opossumList[position]);
    }

    override fun getItemCount(): Int {
        return opossumList.size
    }

    fun addOpossum(opossum: Opossum) {
        opossumList.add(opossum)
        notifyDataSetChanged()
    }
}


