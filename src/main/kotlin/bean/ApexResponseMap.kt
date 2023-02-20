package bean

data class ApexResponseMap(
    val battle_royale: BattleRoyale,
    val ltm: LTM,
    val ranked: Ranked
)

data class BattleRoyale(
    val current: CurrentXX,
    val next: NextXX
)

data class LTM(
    val current: CurrentXXX,
    val next: NextXXX
)

data class Ranked(
    val current: CurrentXXXX,
    val next: NextXXXX
)

data class CurrentXX(
    val DurationInMinutes: Int,
    val DurationInSecs: Int,
    val asset: String,
    val code: String,
    val end: Int,
    val map: String,
    val readableDate_end: String,
    val readableDate_start: String,
    val remainingMins: Int,
    val remainingSecs: Int,
    val remainingTimer: String,
    val start: Int
)

data class NextXX(
    val DurationInMinutes: Int,
    val DurationInSecs: Int,
    val code: String,
    val end: Int,
    val map: String,
    val readableDate_end: String,
    val readableDate_start: String,
    val start: Int
)

data class CurrentXXX(
    val DurationInMinutes: Int,
    val DurationInSecs: Int,
    val asset: String,
    val code: String,
    val end: Int,
    val map: String,
    val readableDate_end: String,
    val readableDate_start: String,
    val remainingMins: Int,
    val remainingSecs: Int,
    val remainingTimer: String,
    val start: Int
)

data class NextXXX(
    val DurationInMinutes: Int,
    val DurationInSecs: Int,
    val code: String,
    val end: Int,
    val map: String,
    val readableDate_end: String,
    val readableDate_start: String,
    val start: Int
)

data class CurrentXXXX(
    val code: String,
    val asset: String,
    val map: String
)

data class NextXXXX(
    val map: String
)
