import lexicon.PartOfSpeech
import lexicon.Root
import lexicon.Translation
import lexicon.Word
import orthography.Consonant
import orthography.Diacritic

val testLexicon: List<Word> = listOf(
    Word(
        chars = listOf(Consonant.RESH, Diacritic.HIRIQ, Consonant.QOF, Diacritic.DAGESH_HAZAQ, Diacritic.OLE, Consonant.VAV, Diacritic.SHURUQ, Consonant.DALET),
        noDiacritics = listOf(listOf(Consonant.RESH, Consonant.YOD, Consonant.QOF, Consonant.VAV, Consonant.DALET)),
        root = Root(
            consonants = listOf(Consonant.RESH, Consonant.QOF, Consonant.DALET)
        ),
        pattern = listOf(Consonant.QOF, Diacritic.HIRIQ, Consonant.TET, Diacritic.DAGESH_HAZAQ, Diacritic.OLE, Consonant.VAV, Diacritic.SHURUQ, Consonant.LAMED),
        pos = PartOfSpeech.NOUN,
        translations = listOf(
            Translation(
                translation = "dance",
            ),
        )
    ),
    Word(
        chars = listOf(Consonant.RESH, Diacritic.QAMATS, Consonant.QOF, Diacritic.PATAH, Diacritic.OLE, Consonant.DALET),
        noDiacritics = listOf(listOf(Consonant.RESH, Consonant.QOF, Consonant.DALET)),
        root = Root(
            consonants = listOf(Consonant.RESH, Consonant.QOF, Consonant.DALET)
        ),
        pattern = listOf(Consonant.PE, Diacritic.QAMATS, Consonant.AYIN, Diacritic.PATAH, Diacritic.OLE, Consonant.LAMED),
        pos = PartOfSpeech.VERB,
        translations = listOf(
            Translation(
                translation = "to dance",
            ),
        )
    ),
    Word(
        chars = listOf(Consonant.HE, Diacritic.HIRIQ, Consonant.SHIN, Diacritic.SHEVA_NACH, Consonant.MEM, Diacritic.HIRIQ, Consonant.YOD, Diacritic.OLE, Consonant.DALET),
        noDiacritics = listOf(listOf(Consonant.HE, Consonant.SHIN, Consonant.MEM, Consonant.YOD, Consonant.DALET)),
        root = Root(
            consonants = listOf(Consonant.SHIN, Consonant.MEM, Consonant.DALET)
        ),
        pattern = listOf(Consonant.HE, Diacritic.HIRIQ, Consonant.PE, Diacritic.SHEVA_NACH, Consonant.AYIN, Diacritic.HIRIQ, Consonant.YOD, Diacritic.OLE, Consonant.LAMED),
        pos = PartOfSpeech.VERB,
        translations = listOf(
            Translation(
                translation = "to destroy",
            ),
        )
    ),
)