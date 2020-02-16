package com.github.aerialist7.demo

import com.github.aerialist7.Api.create

object Api {
    @JsName("HelloWorldComponent")
    fun demoCreate() = create()
}