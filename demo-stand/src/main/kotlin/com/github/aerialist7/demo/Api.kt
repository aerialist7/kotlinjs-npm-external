package com.github.aerialist7.demo

import com.github.aerialist7.Api.create
import org.w3c.dom.HTMLElement

object Api {
    @JsName("HelloWorldComponent")
    fun demoCreate(): HTMLElement {
        return create()
    }
}