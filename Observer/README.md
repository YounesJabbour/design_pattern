


# Observer Design Pattern

The **Observer Design Pattern** is a behavioral pattern used to manage relationships between a subject and multiple observers. This pattern defines a one-to-many dependency between objects, where a change in the subject object automatically notifies and updates all observer objects. This helps in decoupling the subject from the observers, making the system more flexible and easy to maintain.

## Structure

The Observer pattern typically has these components:

1. **Subject**: Manages and updates a list of observers, notifies them of changes.
2. **Observer**: Receives updates from the subject and responds accordingly.
3. **ConcreteSubject**: Implements the subject interface and maintains the state.
4. **ConcreteObserver**: Implements the observer interface and updates based on subject notifications.

![Observer Pattern Diagram](https://example.com/path-to-image) <!-- Replace with actual image link -->

## When to Use Observer Pattern

1. **When multiple objects need to update in response to changes in a single object.**
    - Example: A news website where updates to the main news feed notify and refresh subscribers' news pages.

2. **When you want to decouple objects to make them more modular and independent.**
    - Example: An inventory system where changes in product quantities automatically update customer notifications, supplier inventory, etc.

3. **Event-driven systems where changes in one part of the application should trigger actions elsewhere.**
    - Example: Chat applications where sending a message notifies all active users in the chat.

## Real-World Example: Weather Station

Consider a weather station system that notifies multiple devices (e.g., mobile apps, display screens) whenever weather data is updated.

- **Subject**: Weather Station
- **Observers**: Display screens, Mobile apps, etc.

## UML Class Diagram

The following UML class diagram shows how the Observer Pattern is structured:

![Design_patterns_Observer_image](img/img.png)

## Code Example

Here's a sample Java implementation of the Observer Pattern:

```java
// Subject interface
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Concrete Subject
class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

// Observer interface
interface Observer {
    void update(float temperature);
}

// Concrete Observer
class MobileApp implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Mobile app notified. Temperature is now: " + temperature);
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        WeatherData weatherStation = new WeatherData();
        MobileApp mobileApp = new MobileApp();

        weatherStation.registerObserver(mobileApp);
        weatherStation.setTemperature(25.5f); // Updates mobile app with new temperature
    }
}
