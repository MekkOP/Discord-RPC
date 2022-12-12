fun main() {
  val clientId = "your-client-id"
  val rpc = DiscordRPC(clientID)
  
  val startTimeStamp = System.currentTimeMillis() / 1000
  var endTimeStamp: Long
  
  val activity = RichPresence.Activity(
    state = "Playing Survival Minecraft",
    details = "Placing Obsidian",
    startTimestamp = startTimestamp,
    largeImageKey = "minecraft-logo",
    largeImageText = "Minecraft Java Edition"
    smallImageKey = "character-skin"
    smallImageText = "Username"
    }
