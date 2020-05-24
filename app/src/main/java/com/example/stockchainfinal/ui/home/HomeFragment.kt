package com.example.stockchainfinal.ui.home

import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.stockchainfinal.R
import kotlinx.android.synthetic.main.fragment_notifications.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
        val mText = "About Us"

        val mBSpannableString = SpannableString(mText)

        val mBold = StyleSpan(Typeface.BOLD)
        val mUnderline = UnderlineSpan()

        mBSpannableString.setSpan(mBold,0,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mBSpannableString.setSpan(mUnderline,0,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        textView18.text = mBSpannableString


    }
}
