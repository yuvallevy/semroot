package orthography

enum class Consonant : Grapheme {
    // Native consonants
    ALEF,
    BET,
    GIMEL,
    DALET,
    HE,
    VAV,
    ZAYIN,
    HET,
    TET,
    YOD,
    KAF,
    LAMED,
    MEM,
    NUN,
    SAMEKH,
    AYIN,
    PE,
    TSADI,
    QOF,
    RESH,
    SHIN,
    SIN,
    TAV,
    // Foreign consonants
    JIMEL,
    ZHAYIN,
    CHADI,
    // Invariably dagush/rafe consonants (e.g. to distinguish psps/fsfs as in mefuspas/mefusfas)
    BET_D,
    BET_R,
    KAF_D,
    KAF_R,
    PE_D,
    PE_R,
}