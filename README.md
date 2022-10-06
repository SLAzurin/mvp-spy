# mvp-spy

This app will use Selenium and Firefox to spy on a Discord server, and forward messages from theirs to yours.

### Development notes and wishlist
Wishlist for how I want it to be designed
  - App is continuously running, as a bot for "yours" server.
  - A 2nd thread/async code will be ran on a periodic schedule to capture messages from "theirs" server.
  - This async code will have its own implementation from an abstract class or interface that will be defined depending on "theirs" server layout.
  - Follow PubSub design pattern for 2nd thread and main thread. (Follow this tutorial maybe http://www.java2s.com/example/java/thread/implement-a-pubsub-model.html)
  - Add cli portion of this app if I really want to. (To troll and msg on "yours" server for fun as the bot.)