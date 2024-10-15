# Design Patterns Assignments (Assignment 3)

This repository contains seven assignments demonstrating the implementation of various design patterns in Java. Each assignment folder contains code that adheres to the requirements for implementing a specific design pattern. Below is an overview of each assignment, the design pattern it focuses on, and the corresponding classes.

---

## Assignment 1: Adapter Pattern - Audio Player

### Task:
Implement the Adapter pattern to allow the music player to play WAV and AAC files.

### Requirements:
1. Create an AudioPlayer interface with a play(String audioType, String fileName)
method.
2. Implement an MP3Player class that can play MP3 files.
3. Create interfaces for WAVPlayer and AACPlayer with their respective playWAV and
playAAC methods.
4. Implement an AdvancedAudioPlayer class that can play both WAV and AAC files.
5. Create an AudioAdapter class that allows the AudioPlayer to use the
AdvancedAudioPlayer.
6. Demonstrate the usage of your adapter in a MusicPlayerApp class.

### Description:
This assignment demonstrates the Adapter Pattern by adding support for WAV and AAC audio formats in a music player application that only initially supports MP3 files.

### Key Components:
- **AudioPlayer.java**: Interface with the `play(String audioType, String fileName)` method.
- **MP3Player.java**: Plays MP3 files.
- **WAVPlayer.java & AACPlayer.java**: Interfaces for WAV and AAC playback methods.
- **AdvancedAudioPlayer.java**: Plays WAV and AAC files.
- **AudioAdapter.java**: Adapts the AdvancedAudioPlayer to the AudioPlayer interface.
- **MusicPlayerApp.java**: Demonstrates the usage of the adapter in a music player application.

**Folder:** `Assignment1_AudioPlayer`

---

## Assignment 2: Bridge Pattern - Remote Control System

### Task: 
Use the Bridge pattern to create a flexible remote control system that can work with different devices and manufacturers.

### Requirements:
1. Create a Device interface with methods like powerOn(), powerOff(), setChannel(int
channel), setVolume(int volume).
2. Implement concrete classes for different devices (e.g., TVDevice, DVDDevice,
SoundSystemDevice).
3. Create an abstract RemoteControl class with a reference to Device.
4. Implement concrete remote controls (e.g., BasicRemote, AdvancedRemote with
additional features).
5. Show how the same remote can work with different devices in a
HomeEntertainmentSystem class.

### Description:
This assignment demonstrates the Bridge Pattern by implementing a universal remote control system that works with various electronic devices (TV, DVD Player, Sound System) from different manufacturers.

### Key Components:
- **Device.java**: Interface defining methods like `powerOn()`, `powerOff()`, `setChannel()`, and `setVolume()`.
- **TVDevice.java & DVDDevice.java**: Concrete classes implementing the Device interface.
- **RemoteControl.java**: Abstract class representing a remote control.
- **BasicRemote.java**: Implements basic remote control features.
- **HomeEntertainmentSystem.java**: Demonstrates how a remote control can interact with different devices.

**Folder:** `Assignment2_RemoteControl`

---

## Assignment 3: Composite Pattern - Menu System

### Task: 
Implement the Composite pattern to represent the menu structure.

### Requirements:
1. Create a MenuComponent abstract class with methods like getName(),
getDescription(), getPrice(), print().
2. Implement a MenuItem class for individual dishes.
3. Create a Menu class that can contain MenuComponent objects (either MenuItem or
other Menu objects).
4. Implement methods in Menu to add and remove menu components.
5. Create a RestaurantApp class to demonstrate building a multi-level menu and
printing it

### Description:
This assignment demonstrates the Composite Pattern by creating a menu system where menus can contain individual menu items or other sub-menus.

### Key Components:
- **MenuComponent.java**: Abstract class defining methods for menu items and sub-menus.
- **MenuItem.java**: Represents individual dishes.
- **Menu.java**: Contains other menu components, which can be MenuItems or other Menu objects.
- **RestaurantApp.java**: Builds a multi-level menu system and prints it.

**Folder:** `Assignment3_MenuSystem`

---

## Assignment 4: Decorator Pattern - Pizza Ordering System

### Task:
Use the Decorator pattern to implement a flexible pizza customization system.

### Requirements:
1. Create a Pizza interface with methods getDescription() and getCost().
2. Implement concrete classes for basic pizza types (e.g., MargheritaPizza,
VegetarianPizza).
3. Create an abstract ToppingDecorator class that implements Pizza.
4. Implement concrete decorators for various toppings (e.g., CheeseTopping,
MushroomTopping, PepperoniTopping).
5. Demonstrate the system in a PizzaShop class, allowing for multiple toppings on a
pizza.

### Description:
This assignment demonstrates the Decorator Pattern by building a pizza ordering system where customers can customize pizzas with various toppings.

### Key Components:
- **Pizza.java**: Interface representing a pizza with `getDescription()` and `getCost()` methods.
- **MargheritaPizza.java & VegetarianPizza.java**: Concrete classes representing basic pizza types.
- **ToppingDecorator.java**: Abstract decorator class for pizza toppings.
- **CheeseTopping.java & PepperoniTopping.java**: Concrete decorators that add toppings to pizzas.
- **PizzaShop.java**: Demonstrates ordering pizzas with multiple toppings.

**Folder:** `Assignment4_PizzaOrderingSystem`

---

## Assignment 5: Facade Pattern - Smart Home System

### Task:
Implement a Facade to provide a simple interface for controlling the smart home.

### Requirements:
1. Create classes for each smart device with their respective operations.
2. Implement a SmartHomeFacade class that encapsulates the interaction with all
devices.
3. Add methods to the facade like leaveHome(), arriveHome(), nightMode(),
movieMode().
4. Create a SmartHomeApp class to demonstrate how the facade simplifies the
control of the entire system.

### Description:
This assignment demonstrates the Facade Pattern by implementing a smart home system that controls various devices such as lights, thermostat, and security systems.

### Key Components:
- **Light.java, Thermostat.java, SecuritySystem.java**: Individual smart devices with their operations.
- **SmartHomeFacade.java**: Simplifies the control of multiple devices by encapsulating their interactions.
- **SmartHomeApp.java**: Demonstrates how the facade simplifies operations like `arriveHome()`, `leaveHome()`, and `nightMode()`.

**Folder:** `Assignment5_SmartHomeSystem`

---

## Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor

### Task: 
Use the Flyweight pattern to minimize memory usage when rendering characters in
the text editor.

### Requirements:
1. Create a Character class with intrinsic state (char value, font, size) and extrinsic
state (position).
2. Implement a CharacterFactory that manages character flyweights.
3. Create a TextEditor class that uses the CharacterFactory to render text.
4. Implement a method to insert text and another to render the entire document.
5. In a TextEditorApp class, demonstrate the memory efficiency by inserting and
rendering a large amount of text.

### Description:
This assignment demonstrates the Flyweight Pattern to optimize memory usage when rendering characters in a text editor.

### Key Components:
- **Character.java**: Represents a character with intrinsic (value, font, size) and extrinsic (position) states.
- **CharacterFactory.java**: Manages the character flyweights, ensuring the reuse of existing characters.
- **TextEditor.java**: Uses the CharacterFactory to insert characters and render the document.
- **TextEditorApp.java**: Demonstrates the memory-efficient rendering of large amounts of text.

**Folder:** `Assignment6_TextEditor`

---

## Assignment 7: Proxy Pattern - Online Learning Platform

### Task:
Implement the Proxy pattern to create a virtual proxy for lazy loading of video
lectures.

### Requirements:
1. Create a VideoLecture interface with methods getInfo() and play().
2. Implement a RealVideoLecture class that simulates loading and playing a video
lecture.
3. Create a ProxyVideoLecture class that implements VideoLecture and contains a
reference to RealVideoLecture.
4. In ProxyVideoLecture, implement lazy loading: only create the RealVideoLecture
when play() is called for the first time.
5. Create an OnlineCourse class that contains multiple video lectures.
6. Demonstrate the proxy in action in a LearningPlatformApp, showing how video
lectures load only when played.

### Description:
This assignment demonstrates the Proxy Pattern by creating a virtual proxy for the lazy loading of video lectures in an online learning platform.

### Key Components:
- **VideoLecture.java**: Interface defining `getInfo()` and `play()` methods.
- **RealVideoLecture.java**: Loads and plays video lectures.
- **ProxyVideoLecture.java**: Implements lazy loading; the actual video lecture is only loaded when `play()` is called for the first time.
- **OnlineCourse.java**: Contains multiple video lectures.
- **LearningPlatformApp.java**: Demonstrates lazy loading in action, with video lectures loading only when played.

**Folder:** `Assignment7_OnlineLearning`
