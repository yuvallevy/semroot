package lexicon

data class Translation(
    val translation: String,
    // Registers where the word is used, e.g. formal, vulgar, slang
    val registers: List<String>? = null,
    // Contexts where the word is used, e.g. politics, religion, biology, botany
    // Used to clarify potentially ambiguous translations
    val contexts: List<String>? = null,
    // In case of a polysemous noun (NOT two homophonous nouns) having different inflections in different meanings
    // e.g. "keren" (horn) - if it's a body part, the plural is "karnayim"; if an instrument, the plural is "kranot"
    val specialInflection: NounInflection? = null,
)