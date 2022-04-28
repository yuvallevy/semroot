package lexicon

import orthography.Consonant

/**
 * Represents a consonantal root from which words are derived.
 */
data class Root(
    val consonants: List<Consonant>,
    // Two homonymous roots are distinguished by their copy number
    val copy: Int? = null,
    val etymology: String? = null,
)