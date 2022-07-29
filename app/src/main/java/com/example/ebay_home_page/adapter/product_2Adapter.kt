package com.example.ebay_home_page.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_home_page.R
import com.example.ebay_home_page.model.product_2
import com.google.android.material.imageview.ShapeableImageView

class product_2Adapter (var context: Context, var item:ArrayList<product_2>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_2,parent,false)
        return RecyclerView_2Holder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var product=item[position]

        if(holder is RecyclerView_2Holder){
            var iv_profile=holder.iv_profile
            var tv_fullname=holder.tv_fullname

            iv_profile.setImageResource(product.profile)
            tv_fullname.text=product.fullname
        }
    }

    class RecyclerView_2Holder(view: View):RecyclerView.ViewHolder(view){
        var iv_profile:ShapeableImageView
        var tv_fullname:TextView

        init {
            iv_profile=view.findViewById(R.id.iv_profile)
            tv_fullname=view.findViewById(R.id.tv_fullname)
        }
    }
}