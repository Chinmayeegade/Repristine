package com.example.final_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        if (view != null) {
            init(view)
        }

        return view
    }

    private fun init(view: View?) {

        view?.findViewById<BlankFragment>(R.id.home_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.homeFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.login_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.loginFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.profile_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.profileFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.ideas_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.reuseFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.articles_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.articlesFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.questions_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.questionFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.answers_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.answersFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.CFP_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.carbonFootprintFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.tracker_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.trackerFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.tips_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.tipsFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.stats_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.statsFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.recycle_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.recycleFragment, bundle)
            }
        }

        view?.findViewById<BlankFragment>(R.id.document_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.documentationFragment, bundle)
            }
        }
        view?.findViewById<BlankFragment>(R.id.settings_nav)
        setOnClickListener {
            val bundle = bundleOf("App" to "Trial")
            if (view != null) {
                Navigation.findNavController(view).navigate(R.id.settingsFragment, bundle)
            }
        }


    }

    private fun setOnClickListener(function: () -> Unit) {

    }
}

private fun <T> View?.findViewById(homeNav: Int) {

}
