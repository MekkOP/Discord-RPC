fun main() {
  val clientId = "your-client-id"
  val rpc = DiscordRPC(clientID)
  
  val startTimeStamp = System.currentTimeMillis() / 1000
  var endTimeStamp: Long
  
  val activity = RichPresence.Activity(
    state = "Playing Survival Minecraft",
    details = "Escaping Spawn on 2b2t",
    startTimestamp = startTimestamp,
    largeImageKey = "minecraft-logo",
    largeImageText = "Minecraft Java Edition"
    smallImageKey = "character-skin"
    smallImageText = "Username"
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
