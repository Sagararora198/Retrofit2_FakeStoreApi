package com.example.retrofit.ui.bindingAdapters

import  android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import com.willy.ratingbar.ScaleRatingBar
import kotlinx.coroutines.withContext

@BindingAdapter("loadImageFromUrl")
fun ImageView.loadImageFromUrl(image:String){
    this.load(image)
}

@BindingAdapter("makeRatingFloat")
fun ScaleRatingBar.makeRatingFloat(rate:Double){
    this.rating = rate.toFloat()

}