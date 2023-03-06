package com.example.pokdex.model

data class VersionGroupDetailsItem(val levelLearnedAt: Int = 0,
                                   val versionGroup: VersionGroup,
                                   val moveLearnMethod: MoveLearnMethod)