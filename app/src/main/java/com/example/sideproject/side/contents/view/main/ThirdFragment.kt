package com.example.sideproject.side.contents.view.main


import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent

import com.example.sideproject.R
import com.example.sideproject.databinding.FragmentFirstBinding
import com.example.sideproject.databinding.FragmentThirdBinding
import com.example.sideproject.side.contents.base.BaseFragment
import com.example.sideproject.side.contents.viewmodel.MainViewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding>()  {

    override fun getLayoutId() = R.layout.fragment_third

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val url = "https://paul.kinlan.me/"
        var builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(view.context, Uri.parse(url))
    }

    companion object {
      fun instantiate() : ThirdFragment{
          return ThirdFragment()
      }
    }
}
