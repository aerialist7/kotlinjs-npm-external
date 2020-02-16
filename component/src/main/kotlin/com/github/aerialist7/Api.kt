package com.github.aerialist7

import org.w3c.dom.HTMLElement

object Api {
    @JsName("HelloWorldComponent")
    fun create(): HTMLElement {
        console.log("Hello from HelloWorldComponent!")
        return js("({})") as HTMLElement
    }
}