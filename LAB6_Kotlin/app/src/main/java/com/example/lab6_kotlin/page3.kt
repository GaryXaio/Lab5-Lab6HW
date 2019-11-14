package com.example.lab6_kotlin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class page3 : Fragment(){
    override  fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.e("page3","onCreate")

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.e("page3","onCreate")
        return inflater.inflate(R.layout.page3,container,false)
    }

    override  fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("page3","onActivityCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.e("page3", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.e("page3", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.e("page3", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.e("page3", "onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("page3", "onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("page3", "onDestroy")
    }
    override fun onDetach() {
        super.onDetach()
        Log.e("page3", "onDetach")
    }
}