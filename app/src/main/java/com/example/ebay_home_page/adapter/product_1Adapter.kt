package com.example.ebay_home_page.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_home_page.R
import com.example.ebay_home_page.model.product_1
import com.google.android.material.imageview.ShapeableImageView
import org.w3c.dom.Text

class product_1Adapter(var context: Context, var item:ArrayList<product_1>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_1,parent,false)
        return RecyclerView_1Holder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var product=item[position]


        if(holder is RecyclerView_1Holder){
            var iv_profile=holder.iv_profile
            var tv_fullname=holder.tv_fullname
            var tv_new_price=holder.tv_new_price
            var tv_old_price=holder.tv_old_price
            var tv_percentage=holder.tv_percentage


            iv_profile.setImageResource(product.profile)
            tv_fullname.text=product.fullname
            tv_new_price.text=product.new_price
            tv_old_price.text=product.old_price
            tv_percentage.text=product.percentage
        }

    }

    class RecyclerView_1Holder(view: View):RecyclerView.ViewHolder(view){

        var iv_profile:ShapeableImageView
        var tv_fullname:TextView
        var tv_new_price:TextView
        var tv_old_price:TextView
        var tv_percentage:TextView

        init {
            iv_profile=view.findViewById(R.id.iv_profile)
            tv_fullname=view.findViewById(R.id.tv_name)
            tv_new_price=view.findViewById(R.id.tv_new_price)
            tv_old_price=view.findViewById(R.id.tv_old_price)
            tv_percentage=view.findViewById(R.id.tv_percentage)
        }


    }
}