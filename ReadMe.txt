The MODEL.java is the class which contains the main method of the program. It accepts command line input either via the file or direct text. Once the file or data is provided it calls the Processor class to maintain the subscription list. If any publisher publishes an item the processor checks from the data structure if a subscriber has subscribed to the item, if yes it is notified or else no action is taken.
If the subscriber subscribes to a given item more than once he still receives a single notification from the processor when the item is published.


