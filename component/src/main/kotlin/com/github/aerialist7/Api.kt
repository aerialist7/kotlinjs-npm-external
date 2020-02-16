package com.github.aerialist7

import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

object Api {
    @JsName("HelloWorldComponent")
    fun create() = document.createElement("div")
        .unsafeCast<HTMLDivElement>()
        .apply { textContent = "Hello, World!" }
}