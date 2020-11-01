# Karel in Java for Maven

This is a modified fork of CodeHS Karel the Dog in Java -- Fork of ACM.jar and Stanford Karel
See: https://github.com/codehs/javakarel

Learn more about ACM Java Task Force here: http://cs.stanford.edu/people/eroberts/jtf/
This is the origin ACM library licence: http://cs.stanford.edu/people/eroberts/jtf/documents/License.pdf

## Quickstart

We are using **jbang** to run the examples. Learn more at https://www.jbang.dev

To test out an example open the root directory in your terminal. Then navigate to SimpleKarel example

    $ cd src/main/examples/rowofbeepers
    $ jbang rowofbeepers.java

or

    $ jbang rowofbeepers@zemiak/javakarel

# Karel Commands

Taken from: https://karel.csbridge.org/java/en/intro.html
The original PDF: https://karel.csbridge.org/original.pdf

## Basic Commands

    move();
    turnLeft();
    putBeeper();
    pickBeeper();

## Karel Conditions

    frontIsClear()
    beepersPresent()
    beepersInBag()
    leftIsClear()
    rightIsClear()
    facingNorth()
    facingSouth()
    facingEast()
    facingWest()
    frontIsBlocked() noBeepersPresent()
    noBeepersInBag()
    leftIsBlocked()
    rightIsBlocked()
    notFacingNorth()
    notFacingSouth()
    notFacingEast()
    notFacingWest()

## Super Karel

    turnRight();
    turnAround();
    random(p);
    paintCorner(color);
