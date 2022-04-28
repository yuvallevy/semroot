package lexicon

import orthography.Consonant
import orthography.Grapheme

data class Word(
    val chars: List<Grapheme>,
    val noDiacritics: List<List<Consonant>>?,
    val root: Root,
    val pattern: List<Grapheme>,
    val pos: PartOfSpeech,
    val translations: List<Translation>,
)