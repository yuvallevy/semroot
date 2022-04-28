import lexicon.PartOfSpeech
import lexicon.Root
import lexicon.Translation
import lexicon.Word
import orthography.Consonant
import orthography.Diacritic

val placeholderLexicon: List<Word> = listOf(
    Word(
        chars = listOf(Consonant.HE, Diacritic.QAMATS, Consonant.PE, Diacritic.PATAH, Diacritic.OLE, Consonant.KAF, Diacritic.SHEVA_NACH),
        noDiacritics = listOf(listOf(Consonant.HE, Consonant.PE, Consonant.KAF)),
        root = Root(consonants = listOf(Consonant.HE, Consonant.PE, Consonant.KAF)),
        pattern = listOf(Consonant.PE, Diacritic.QAMATS, Consonant.AYIN, Diacritic.PATAH, Diacritic.OLE, Consonant.LAMED),
        pos = PartOfSpeech.VERB,
        translations = listOf(
            Translation(translation = "to flip, turn sth. over"),
            Translation(translation = "to become, turn/change into"),
            Translation(translation = "to invert"),
        ),
    ),
    Word(
        chars = listOf(Consonant.HE, Diacritic.HIRIQ, Consonant.TAV, Diacritic.SHEVA_NACH, Consonant.HE, Diacritic.PATAH, Consonant.PE, Diacritic.DAGESH_HAZAQ, Diacritic.TSERE, Diacritic.OLE, Consonant.KAF, Diacritic.SHEVA_NACH),
        noDiacritics = listOf(listOf(Consonant.HE, Consonant.TAV, Consonant.HE, Consonant.PE, Consonant.KAF)),
        root = Root(consonants = listOf(Consonant.HE, Consonant.PE, Consonant.KAF)),
        pattern = listOf(Consonant.HE, Diacritic.HIRIQ, Consonant.TAV, Diacritic.SHEVA_NACH, Consonant.PE, Diacritic.PATAH, Consonant.AYIN, Diacritic.DAGESH_HAZAQ, Diacritic.TSERE, Diacritic.OLE, Consonant.LAMED),
        pos = PartOfSpeech.VERB,
        translations = listOf(
            Translation(translation = "to become flipped or turned over"),
            Translation(translation = "to become inverted"),
        ),
    ),
    Word(
        chars = listOf(Consonant.HE, Diacritic.SEGOL, Diacritic.OLE, Consonant.PE, Diacritic.SEGOL, Consonant.KAF, Diacritic.SHEVA_NACH),
        noDiacritics = listOf(listOf(Consonant.HE, Consonant.PE, Consonant.KAF)),
        root = Root(consonants = listOf(Consonant.HE, Consonant.PE, Consonant.KAF)),
        pattern = listOf(Consonant.QOF, Diacritic.SEGOL, Diacritic.OLE, Consonant.TET, Diacritic.SEGOL, Consonant.LAMED),
        pos = PartOfSpeech.NOUN,
        translations = listOf(
            Translation(translation = "opposite"),
        ),
    ),
    Word(
        chars = listOf(Consonant.MEM, Diacritic.PATAH, Consonant.HE, Diacritic.SHEVA_NACH, Consonant.PE, Diacritic.DAGESH_QAL, Diacritic.TSERE, Consonant.KAF, Diacritic.QAMATS, Diacritic.OLE, Consonant.HE),
        noDiacritics = listOf(listOf(Consonant.HE, Consonant.PE, Consonant.KAF)),
        root = Root(consonants = listOf(Consonant.HE, Consonant.PE, Consonant.KAF)),
        pattern = listOf(Consonant.MEM, Diacritic.PATAH, Consonant.QOF, Diacritic.SHEVA_NACH, Consonant.TET, Diacritic.TSERE, Consonant.LAMED, Diacritic.QAMATS, Diacritic.OLE, Consonant.HE),
        pos = PartOfSpeech.NOUN,
        translations = listOf(
            Translation(translation = "revolution (great change, political or otherwise)"),
        ),
    ),
)