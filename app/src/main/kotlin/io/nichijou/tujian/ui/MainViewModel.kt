package io.nichijou.tujian.ui

import androidx.lifecycle.*

class MainViewModel : ViewModel() {
  val barColor by lazy { MutableLiveData<Int>() }
  val enableScreenSaver by lazy { MutableLiveData<Boolean>() }
}