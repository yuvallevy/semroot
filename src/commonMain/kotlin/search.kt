import lexicon.Word
import orthography.Consonant

fun List<Word>.searchByRoot(rootConsonants: List<Consonant>) =
    filter { it.root.consonants == rootConsonants }