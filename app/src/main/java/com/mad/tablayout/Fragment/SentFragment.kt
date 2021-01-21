package com.mad.tablayout.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mad.tablayout.R

/**
 * A simple [Fragment] subclass.
 * Use the [SentFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sent, container, false)
    }

}