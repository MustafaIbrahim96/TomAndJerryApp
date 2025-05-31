package com.mustafa.tomandjerrytask

data class TomCharacter(
    val image:Int,
    val title:String,
    val description:String,
    val price:Int,
    val hasDiscount : Boolean,
    val discountPrice:Int
)


val tomList = listOf(
    TomCharacter(
        R.drawable.img_sport_tom,
        "Sport Tom",
        "He runs 1 meter... trips over his boot.",
        5,
        true,
        3
    ),
    TomCharacter(
        R.drawable.img_tom_lover,
        "Tom the lover",
        "He loves one-sidedly... and is beaten by the other side.",
        5,
        false,
        0
    ),
    TomCharacter(
        R.drawable.img_tom_bomb,
        "Tom the bomb",
        "He blows himself up before Jerry can catch him.",
        10,
        false,
        0
    ),
    TomCharacter(
        R.drawable.img_tom_spy,
        "Spy Tom",
        "Disguises itself as a table.",
        12,
        false,
        0
    ),
    TomCharacter(
        R.drawable.img_tom_frozen,
        "Frozen Tom",
        "He was chasing Jerry, he froze after the first look",
        10,
        false,
        0
    ), TomCharacter(
        R.drawable.img_tom_sleeping,
        "Sleeping Tom",
        "He doesn't chase anyone, he just snores in stereo.",
        10,
        false,
        0
    )
)