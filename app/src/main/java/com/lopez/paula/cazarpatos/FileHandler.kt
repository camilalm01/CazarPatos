package com.lopez.paula.cazarpatos

interface FileHandler {
    fun SaveInformation(datosAGrabar:Pair<String,String>)
    fun ReadInformation():Pair<String,String>
}