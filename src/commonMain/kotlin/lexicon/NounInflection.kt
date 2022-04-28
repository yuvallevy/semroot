package lexicon

import orthography.Grapheme

data class NounInflection(
    val construct: List<Grapheme>,
    val plural: List<Grapheme>,
    val constructPlural: List<Grapheme>,
    val dual: List<Grapheme>,
)