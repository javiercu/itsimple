# Analysis #

The dynamic analysis can be done with the use of Petri Nets since UML diagrams do not provide all necessary features for such analysis,

_itSIMPLE_ is able to generate _Petri Nets_ (simulating them for dynamic verification) and PDDL representations of the domain and problems, which can be used as input for the planners.

Basically a classical _Petri net_ is a directed bipartite graph with two node types called places and transitions. The nodes are connected via directed arcs. Connections between two nodes of the same type are not allowed. Places are represented by circles and transitions by bars. Places may contain zero or more tokens, drawn as black dots.

For analyzing our State Machines using _Petri nets_ you must clicking on the Analysis Tab in the _itSIMPLE_ main screen (**1:**):

![https://itsimple.googlecode.com/svn/wiki/resources/images/Analysis/analyze_screen.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Analysis/analyze_screen.png)

Automatically will appear in _Projects manager_  panel all projects that are being processed in _itSIMPLE_ at the time (**2:**) and you can select one project for analyze.

For each project selected, will appear theirs _State Machine Diagram_ in _State Chart Diagram_ panel (**3:**) defined in [itSIMPLE modeling process](ModellingStateDiagram.md) and when you select one of them, you must click over _Build_ option (**4:**).

In _Petri Net_ panel (**5:**) you can see the Analysis results based on the actions through Petri nets diagram.

Bar tool:

![https://itsimple.googlecode.com/svn/wiki/resources/images/Analysis/analyze_bartool.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Analysis/analyze_bartool.png)

Click run option (![https://itsimple.googlecode.com/svn/wiki/resources/images/Analysis/step.png](https://itsimple.googlecode.com/svn/wiki/resources/images/Analysis/step.png)). The enabled transitions have green color and you can see in one step how are executed. Insofar as the transitions are executed, the result is visualize in the _Result_ panel (**6:**).

Beside, you can visualize in only one Petri net diagram corresponding for each State _Machine Diagram_: Select all _State Machine Diagrams_ in _State Chart Diagram_ panel (**3:**) and click over _Build_ Option (**4:**).

In order to hold all information available in several representation languages (_UML_, _Petri Nets_ and _PDDL_) _itSIMPLE_ uses the well-known language _XML_ which is commonly used in data transactions systems, web applications and data sharing systems. The important point on using _XML_ is that some proposed integrated languages have direct representation in _XML_ such as _PNML_ - which stands for _Petri Nets Markup Language_.

Actually, in order to create a _Petri Net_ representation, a model is first represented in _PNML_ form and then showed to the user as a Petri Net graph for simulation and analysis. _itSIMPLE_ can save all _Petri Nets_ diagram to _PNML_ format. (**7:**).

  * [Planning Process](PlanningProcess.md)