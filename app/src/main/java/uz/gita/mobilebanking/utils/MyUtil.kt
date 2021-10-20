package uz.gita.mobilebanking.utils

import androidx.viewbinding.ViewBinding

fun <T : ViewBinding> T.scope(block : T.() ->Unit) {
    block(this)
}