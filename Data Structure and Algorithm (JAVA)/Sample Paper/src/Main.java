import java.util.*;

class FoodOrderingSystem {
    private static final int MAX_CAPACITY = 3;
    private Map<String, LinkedList<String>> windows;
    private LinkedList<String> waitingQueue;

    public FoodOrderingSystem() {
        windows = new HashMap<>();
        windows.put("pizza", new LinkedList<>());
        windows.put("pasta", new LinkedList<>());
        windows.put("salad", new LinkedList<>());
        waitingQueue = new LinkedList<>();
    }

    public void enterShop(String name, String foodItem) {
        LinkedList<String> windowQueue = windows.get(foodItem);

        if (windowQueue.size() < MAX_CAPACITY) {
            windowQueue.addLast(name);
            System.out.println(name + " assigned to " + foodItem + " window.");
        } else {
            waitingQueue.addLast(name + "," + foodItem);
            System.out.println(name + " added to waiting queue.");
        }
    }

    public void exitShop(String name, String foodItem) {
        LinkedList<String> windowQueue = windows.get(foodItem);
        windowQueue.remove(name);
        System.out.println(name + " exited from " + foodItem + " window.");

        if (!waitingQueue.isEmpty()) {
            String[] nextCustomer = waitingQueue.removeFirst().split(",");
            if (nextCustomer[1].equals(foodItem) && windowQueue.size() < MAX_CAPACITY) {
                windowQueue.addLast(nextCustomer[0]);
                System.out.println(nextCustomer[0] + " moved to " + foodItem + " window.");
            } else {
                waitingQueue.addFirst(nextCustomer[0] + "," + nextCustomer[1]);
            }
        }
    }

    public void showQueueInfo() {
        windows.forEach((foodItem, queue) -> {
            System.out.println(foodItem + " window queue: " + queue);
        });
        System.out.println("Waiting queue: " + waitingQueue);
    }

    public static void main(String[] args) {
        FoodOrderingSystem system = new FoodOrderingSystem();

        // Example of usage
        system.enterShop("Alice", "pizza");
        system.enterShop("Bob", "pasta");
        system.enterShop("Charlie", "salad");
        system.enterShop("Dave", "pizza"); // Will be added to waiting queue
        system.showQueueInfo();

        system.exitShop("Alice", "pizza");
        system.showQueueInfo();
    }
}
