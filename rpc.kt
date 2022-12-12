fun main() {
  val clientId = "your-client-id"
  val rpc = DiscordRPC(clientID)
  
  val startTimeStamp = System.currentTimeMillis() / 1000
  var endTimeStamp: Long
  
  val activity = RichPresence.Activity(
  // Start of the stuff you can change
    state = "what-gamemode-your-in",
    details = "what-your-doing",
    startTimestamp = startTimestamp, // Dont Change this
    largeImageKey = "minecraft-logo",
    largeImageText = "what-minecraft-version (java or bedrock)"
    smallImageKey = "skin"
    smallImageText = "Username"
  // End of the stuff you can change
    }

    var currentDimension = "Overworld"
    
    rpc.updatePresence(activity)
    
    while (true) {
      endTimestamp = System.currentTimeMillis() / 1000
      activity.timestamps.startTimestamp = startTimestamp
      activity.timestamps.endTimestamp = endTimestamp
      
      activity.state = "Escaping spawn on 2b2t in the $currentDimension
      
      rpc.updatePresence(activity)
      
      currentDimension = getCurrentDimension()
      
      Thread.sleep(15000)
    }
}
