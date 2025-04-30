package io.github.a13e300.tricky_store

import android.os.Build.VERSION.SDK_INT
import android.os.Build.VERSION_CODES

fun main() {
    Logger.i("Welcome to TrickyStore!")
    if (SDK_INT >= VERSION_CODES.Q){
        while (true) {
            if (!KeystoreInterceptor.tryRunKeystoreInterceptor()) {
                Thread.sleep(1000)
                continue
            }
            Config.initialize()
            while (true) {
                Thread.sleep(1000000)
            }
        }
    }
}
