package com.example.viewpager2tablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class ViewPagerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val webViewWV = view.findViewById<WebView>(R.id.webViewWV)
        val viewPagerItem = arguments?.getSerializable("role") as? Role
        webViewWV.webViewClient = WebViewClient()

       if(viewPagerItem != null){
           webViewWV.loadUrl(viewPagerItem.url)
           }
    }

}