## Media Rental System (Java)

A simple Java-based system for managing the rental of media items such as Movies, Games, and Albums.
The system supports customer management, media inventory, shopping carts, rental processing, and request handling.
#### Project Structure
Project2/
│
├── Media.java
├── Movie.java
├── Album.java
├── Game.java
│
├── Customer.java
├── MediaRental.java
├── MediaRentallnt.java
│
├── Driver.java
│
├── customer.txt
├── media.txt
├── cart.txt
└── rented.txt

#### Features
#### Media Types

The system supports three media categories:

Movie

Game

Album

Each media type contains shared attributes (code, title, copies) + its own unique fields.

#### Customer Management

Add new customers

Read customers from customer.txt

Store customer data persistently

#### Media Inventory

Add media items (Movies, Games, Albums)

Load media from media.txt

Update remaining copies automatically

#### Cart System

Customers can:

Add media items to their cart

Remove items

View all items currently in the cart

Cart data is stored in:

cart.txt

#### Rental Processing

The system supports:

Moving items from cart → rented

Updating media copies

Generating rental records

All active rentals are stored in:

rented.txt

#### Media Requests

Customers can:

Request a media item

Check media availability

Process multiple orders at once

Each request is validated by:

Media availability

Customer status

Media type

#### How to Run

Compile all classes:

javac *.java


Run the main driver:

java Driver


Make sure the text files (customer.txt, media.txt, cart.txt, rented.txt) exist in the same directory as the .java files.

#### Text File Format
customer.txt
customerName, ID, Address, Plan

media.txt
mediaCode, Title, CopiesAvailable, MediaType, ExtraField

cart.txt
customerID, mediaCode

rented.txt
customerID, mediaCode

#### How the System Works (Overview)

Driver.java
Loads the system, reads files, and calls menu operations.

MediaRental.java
Main class that manages:

Customers

Media

Carts

Rentals

Requests

Media + Movie + Game + Album
Abstract model + concrete media types.

Customer.java
Stores customer info + cart + rented items.

#### Requirements

Java 8+

Text files in the same directory

Console-based execution

 #### Future Improvements

You can add these features later:

GUI interface (JavaFX/Swing)

Database instead of text files

Search filters

Sorting customers/media

Saving system state after every update

👤 Author

Amro Hammad
Java Developer – Student Project
