// Created manually
package com.github.aerialist7

import org.w3c.dom.Node

@JsModule("svg2pdf.js")
external fun svg2pdf(
    element: Node,
    pdf: jsPDF,
    options: Any? = definedExternally
): jsPDF = definedExternally