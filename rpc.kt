fun main() {
    val clientId = "your-client-id-here"
    val rpc = DiscordRPC(clientId)

    val startTimestamp = System.currentTimeMillis() / 1000
    var endTimestamp: Long

    val activity = RichPresence.Activity(
        state = "Playing on Survival Mode",
        details = "Building a house",
        startTimestamp = startTimestamp,
        largeImageKey = "minecraft-logo",
        largeImageText = "Minecraft",
        smallImageKey = "character-skin",
        smallImageText = "Steve"
    )

    var currentDimension = "Overworld"
    var coordinates = "0, 0, 0"

    rpc.updatePresence(activity)

    while (true) {
        endTimestamp = System.currentTimeMillis() / 1000

        val elapsedMinutes = ((endTimestamp - startTimestamp) / 3600).toInt()

        activity.state = "Playing on Survival Mode in the $currentDimension"
        activity.details = "Coordinates: $coordinates\nPlaying for $elapsedMinutes minutes"

        rpc.updatePresence(activity)

        currentDimension = getCurrentDimension()
        coordinates = getCoordinates()

        Thread.sleep(15000)
    }
}
