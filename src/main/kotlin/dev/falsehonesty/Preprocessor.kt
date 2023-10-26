package dev.falsehonesty

val ALLOWED_TYPES = listOf("JAVA", "KOTLIN")

class PreprocessorState {
    companion object {
        val NONE = PreprocessorState()
        val IF = PreprocessorState()
        val ELSE = PreprocessorState()
    }
}

//enum class PreprocessorDirective {
//    IF,
//    IFDEF,
//    ELSE,
//    ENDIF
//}