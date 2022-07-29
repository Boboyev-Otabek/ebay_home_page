package com.example.ebay_home_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_home_page.adapter.product_1Adapter
import com.example.ebay_home_page.adapter.product_2Adapter
import com.example.ebay_home_page.model.product_1
import com.example.ebay_home_page.model.product_2

class MainActivity : AppCompatActivity() {

    lateinit var recyclerview_1: RecyclerView

    lateinit var recyclerview_2: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView(){
        recyclerview_1=findViewById(R.id.recyclerview_1)
        recyclerview_1.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        refreshAdapter_1(getAllProduct_1())

        recyclerview_2=findViewById(R.id.recyclerview_2)
        recyclerview_2.layoutManager=GridLayoutManager(this,3)

        refreshAdapter_2(getAllProduct_2())



    }

    fun refreshAdapter_1(product1:ArrayList<product_1>){

        var adapter1=product_1Adapter(this,product1)
        recyclerview_1.adapter=adapter1
    }
    fun refreshAdapter_2(product2:ArrayList<product_2>){

        var adapter2=product_2Adapter(this,product2)
        recyclerview_2.adapter=adapter2
    }


    fun getAllProduct_1():ArrayList<product_1>{

        var product=ArrayList<product_1>()
        product.add(product_1(R.drawable.car_1,"mashina 1","$200mln","$100mln","50% off"))
        product.add(product_1(R.drawable.car_2,"mashina 2","$200mln","$100mln","50% off"))
        product.add(product_1(R.drawable.car_3,"mashina 3","$200mln","$100mln","50% off"))
        product.add(product_1(R.drawable.car_4,"mashina 4","$200mln","$100mln","50% off"))

        product.add(product_1(R.drawable.car_5,"mashina 5","$200mln","$100mln","50% off"))
        product.add(product_1(R.drawable.car_6,"mashina 6","$200mln","$100mln","50% off"))
        product.add(product_1(R.drawable.car_7,"mashina 7","$200mln","$100mln","50% off"))

        return product
    }

    fun getAllProduct_2():ArrayList<product_2>{

        var product_2=ArrayList<product_2>()

        product_2.add(product_2(R.drawable.car_4,"Mashina "))
        product_2.add(product_2(R.drawable.car_3,"Mashina "))
        product_2.add(product_2(R.drawable.car_1,"Mashina "))
        product_2.add(product_2(R.drawable.car_7,"Mashina "))
        product_2.add(product_2(R.drawable.car_5,"Mashina "))
        product_2.add(product_2(R.drawable.car_2,"Mashina "))
        product_2.add(product_2(R.drawable.car_4,"Mashina "))
        product_2.add(product_2(R.drawable.car_3,"Mashina "))
        product_2.add(product_2(R.drawable.car_1,"Mashina "))
        product_2.add(product_2(R.drawable.car_7,"Mashina "))
        product_2.add(product_2(R.drawable.car_5,"Mashina "))
        product_2.add(product_2(R.drawable.car_2,"Mashina "))
        return product_2
    }

}