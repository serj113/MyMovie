package com.nok.mymovie.movielist

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.nok.mymovie.R
import com.nok.mymovie.base.BaseFragment


class MovieListFragment : BaseFragment<MovieListVM>() {

    private lateinit var vm: MovieListVM
    private var listener: OnFragmentInteractionListener? = null

    override fun initVM() {
        vm = ViewModelProviders.of(this).get(MovieListVM::class.java)
    }

    override fun getVM(): MovieListVM {
        return vm
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_movie_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vm.loadData()
    }

    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }

    // override fun onAttach(context: Context) {
    //     super.onAttach(context)
    //     if (context is OnFragmentInteractionListener) {
    //         listener = context
    //     } else {
    //         throw RuntimeException("$context must implement OnFragmentInteractionListener")
    //     }
    // }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        @JvmStatic
        fun newInstance() = MovieListFragment()
    }
}
