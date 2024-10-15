# Design Patterns Assignments (Assignment 3)

This repository contains seven assignments demonstrating the implementation of various design patterns in Java. Each assignment folder contains code that adheres to the requirements for implementing a specific design pattern. Below is an overview of each assignment, the design pattern it focuses on, and the corresponding classes.

---

## Assignment 1: Adapter Pattern - Audio Player

**Folder:** `assignment_1_Audio_Player`

### Description
This assignment demonstrates the Adapter Pattern by adding support for WAV and AAC audio formats in a music player application that only initially supports MP3 files.

### Key Components
- **AudioPlayer.java**: Interface with the `play(String audioType, String fileName)` method.
- **MP3Player.java**: Plays MP3 files.
- **WAVPlayer.java & AACPlayer.java**: Interfaces for WAV and AAC playback methods.
- **AdvancedAudioPlayer.java**: Plays WAV and AAC files.
- **AudioAdapter.java**: Adapts the AdvancedAudioPlayer to the AudioPlayer interface.
- **MusicPlayerApp.java**: Demonstrates the usage of the adapter in a music player application.

---

## Assignment 2: Bridge Pattern - Remote Control System

**Folder:** `assignment2_RemoteControl`

### Description
This assignment demonstrates the Bridge Pattern by implementing a universal remote control system that works with various electronic devices (TV, DVD Player, Sound System) from different manufacturers.

### Key Components
- **Device.java**: Interface defining methods like `powerOn()`, `powerOff()`, `setChannel()`, and `setVolume()`.
- **TVDevice.java & DVDDevice.java**: Concrete classes implementing the Device interface.
- **RemoteControl.java**: Abstract class representing a remote control.
- **BasicRemote.java**: Implements basic remote control features.
- **HomeEntertainmentSystem.java**: Demonstrates how a remote control can interact with different devices.

---

## Assignment 3: Composite Pattern - Menu System

**Folder:** `assignment3_MenuSystem`

### Description
This assignment demonstrates the Composite Pattern by creating a menu system where menus can contain individual menu items or other sub-menus.

### Key Components
- **MenuComponent.java**: Abstract class defining methods for menu items and sub-menus.
- **MenuItem.java**: Represents individual dishes.
- **Menu.java**: Contains other menu components, which can be MenuItems or other Menu objects.
- **RestaurantApp.java**: Builds a multi-level menu system and prints it.

---

## Assignment 4: Decorator Pattern - Pizza Ordering System

**Folder:** `assignment4_PizzaOrderingSystem`

### Description
This assignment demonstrates the Decorator Pattern by building a pizza ordering system where customers can customize pizzas with various toppings.

### Key Components
- **Pizza.java**: Interface representing a pizza with `getDescription()` and `getCost()` methods.
- **MargheritaPizza.java & VegetarianPizza.java**: Concrete classes representing basic pizza types.
- **ToppingDecorator.java**: Abstract decorator class for pizza toppings.
- **CheeseTopping.java & PepperoniTopping.java**: Concrete decorators that add toppings to pizzas.
- **PizzaShop.java**: Demonstrates ordering pizzas with multiple toppings.

---

## Assignment 5: Facade Pattern - Smart Home System

**Folder:** `assignment5_SmartHomeSystem`

### Description
This assignment demonstrates the Facade Pattern by implementing a smart home system that controls various devices such as lights, thermostat, and security systems.

### Key Components
- **Light.java, Thermostat.java, SecuritySystem.java**: Individual smart devices with their operations.
- **SmartHomeFacade.java**: Simplifies the control of multiple devices by encapsulating their interactions.
- **SmartHomeApp.java**: Demonstrates how the facade simplifies operations like `arriveHome()`, `leaveHome()`, and `nightMode()`.

---

## Assignment 6: Flyweight Pattern - Character Rendering in a Text Editor

**Folder:** `assignment6_TextEditor`

### Description
This assignment demonstrates the Flyweight Pattern to optimize memory usage when rendering characters in a text editor.

### Key Components
- **Character.java**: Represents a character with intrinsic (value, font, size) and extrinsic (position) states.
- **CharacterFactory.java**: Manages the character flyweights, ensuring the reuse of existing characters.
- **TextEditor.java**: Uses the CharacterFactory to insert characters and render the document.
- **TextEditorApp.java**: Demonstrates the memory-efficient rendering of large amounts of text.

---

## Assignment 7: Proxy Pattern - Online Learning Platform

**Folder:** `assignment7_OnlineLearning`

### Description
This assignment demonstrates the Proxy Pattern by creating a virtual proxy for the lazy loading of video lectures in an online learning platform.

### Key Components
- **VideoLecture.java**: Interface defining `getInfo()` and `play()` methods.
- **RealVideoLecture.java**: Loads and plays video lectures.
- **ProxyVideoLecture.java**: Implements lazy loading; the actual video lecture is only loaded when `play()` is called for the first time.
- **OnlineCourse.java**: Contains multiple video lectures.
- **LearningPlatformApp.java**: Demonstrates lazy loading in action, with video lectures loading only when played.
