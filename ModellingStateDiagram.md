# _State machine diagram_ #

A State Machine diagram illustrates how an element (often a Class) can move between states, classifying its behavior according to transition triggers and constraining guards. Other aspects of State Machine diagrams further depict and explain movement and behavior.

According to _OMG UML Superstructure Specification_ State Machine representations in UML are based on the _Harel State Chart Notation_, and therefore are sometimes referred to as _State Charts_.

![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/state_diagram.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/state_diagram.png)

## _Toolbox Elements and connectors_ ##

To define an _State machine diagram_ with itSIMPLE tool, you must first specify in _Properties Object_ panel a _name_ and select a _class_ which is associated to the diagram. Select a choice _Open Diagram_ doing right click on _State Machine_ icon at _Projects Manager_ panel and will appear _Digram View_ area for building you state diagram with a tool bar for modeling:

![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/toolbarSD.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/toolbarSD.png)

In the _Properties Object_ you can describe a description for you state machine. In this same panel there is othet tab (_Internal conditions_).

_Internal conditions_ are also situations similarly to preconditions and post conditions. When a transition has as origen a state machine that has “internal conditions” implies  that “_Internal Conditions U Preconditions_” are necessary to fire a transition, and when a transition has a destination a state machine that has “internal conditions” implies that “_Post Conditions U Internal Conditions_” will effect changes in the world.

### State ###

A _State_ (![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/state.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/state.png)) represents a situation where some invariant condition holds; this condition can be static (waiting for an event) or dynamic (performing a set of activities).

State modeling is usually related to _Classes_ , and describes the enableable states a Class or element can be in and the transitions that enable the element to move there.

  * According _OMG UML Specification_: A state models a situation during which some (usually implicit) invariant condition holds. The invariant may represent a static situation such as an object waiting for some external event to occur. However, it can also model dynamic conditions such as the process of performing some activity (i.e., the model element under consideration enters the state when the activity commences and leaves it as soon as the activity is completed).

For create a _state_ with _itSIMPLE_ tool, you must click on the _state_ icon (![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/state.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/state.png)) at the toolbar and choose on the _Diagram View Area_ where you want put it.

### Initial state ###

The Initial state( ![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/initialState.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/initialState.png) ) is used by _State Machine diagrams_. In _State Machines_, the Initial element is a pseudo-state used to denote the default state of a Composite State ; there can be one Initial vertex in each Region of the Composite State.
#sidebar Table
  * According _OMG UML Specification_: An initial pseudostate represents a default vertex that is the source for a single transition to the default state of a composite state. There can be at most one initial vertex in a region. The outgoing transition from the initial vertex may have a behavior, but not a trigger or guard.  An initial node is a control node at which flow starts when the activity is invoked.

For create a _Initial state_ with _itSIMPLE_ tool, you must click on the _initial state_ icon ( ![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/initialState.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/initialState.png) ) at the toolbar and choose on the _Diagram View Area_ where you want put it.

### Action association ###

An _Association_ (![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/association.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/association.png)) implies two model elements have a _relationship_, in this case a _State_ and an _Initial state_

For define an association, you must first click on _Initial state_ icon and afterwards click on the _State_ to complete the association.

You must choose the right action in the association's _Object Properties_:

And if you need to define _Pre_ and _Post Conditions_ to the action you can do it in the _Conditions_ tab in the same panel or define somo effects in the _Effects_ tab.

![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/propertyAssociation.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/propertyAssociation.png)
### Final state ###

The Final state( ![https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/finalState.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Modeling/StateMachineDiagram/finalState.png) )is used to define a Final state in an _State Machine Diagram_.

  * [Use case diagram](ModellingUseCase.md)
  * [Class diagram](ModellingClassDiagram.md)
  * [UML Object (snapshot) Diagram](ModellingObject.md)