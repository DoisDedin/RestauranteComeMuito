package com.example.redederestaurantecomemuito.ui.main.common

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> Fragment.observe(observable: LiveData<T>, listener: Observer<T>) =
    observable.observe(viewLifecycleOwner, listener)