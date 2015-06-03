# Getting started #
**itSIMPLE 4.0** is a java-based software and run on _Windows_, _Linux_ and _Mac_.

## _Installing itSIMPLE_ ##
<a href='Hidden comment: 
==A==
'></a>

### Linux ###

  * Check if you have the lastest version of Java Runtime installed (e.g., **JRE 6**, http://java.sun.com). You can check your version by typing _"java -version" in a terminal_;
  * Download itSIMPLE http://code.google.com/p/itsimple/downloads/list
  * Unzip the file;
  * Change permission (typing in command line: _chmod +x itSIMPLE.jar_);
  * Run the software: Typing in command line: _java -jar itSIMPLE.jar_;
  * To run the planners from itSIMPLE, change permission of all planner files in the /myPlanners folder so they can be executed (typing in command line: _chmod +x name-of-the-panner_);

## _Windows (XP/Vista/7.0)_ ##
  * Check if you have the lastest version of _Java Runtime installed_ (e.g., **JRE 6**, http://java.sun.com). You can check your version by typing _"java -version"_ in a terminal;
  * Download itSIMPLE http://code.google.com/p/itsimple/downloads/list
  * Unzip the file;
  * Run the software: Typing in command line: _java -jar itSIMPLE.jar_ or double-clicking on _itSIMPLE.jar_ file.


## _For Developers_ ##

### Set up  itSIMPLE in Eclipse or Netbeans for development ###

### Eclipse ###
  1. Check out **itSIMPLE** project (Repository folder: https://itsimple.googlecode.com/svn/trunk/) to a local folder in your computer, e.g. recommended a folder called _‘itSIMPLEsrc’_ (not in the workspace folder of Eclipse). Wait for checkout completion.
  1. Create a new project (_New-> Java Project_ choice). Name the project _'itSIMPLE'_. Press _Next_ and on the _Source_ tab press _"Link Additional source to the project"_. Chose the _'itSIMPLEsrc'_ folder were the checkout was done.
  1. Add the **JAR/ZIP libraries** to the project (right click over the _project -> Properties -> Java Build Path_ and on the Libraries tab press _Add external Jars_). Selected all .jar libraries. They will be in the folder _.../itSIMPLEsrc/lib_.
  1. Copy and paste the following folders _‘resource’_, _‘myPlanners_, _‘myIcons’_, _‘myValidators’_, and _‘myAnalyzers’_ from the _itSIMPLEsrc_ folder into the project folder created by **Eclipse** (e.g., _workspace/itSIMPLE_). This is necessary for running **itSIMPLE** inside the **Eclipse** environment.
  1. Run the class **ItSIMPLE.java**.

### Netbeans ###
  1. Check out **itSIMPLE** project (_team->checkout_ choice; _Repository folder_: https://itsimple.googlecode.com/svn/trunk/) to a local folder in your computer, e.g. in a folder called _‘itSIMPLEsrc’_ (not in the **Netbeans Projects** folder). Uncheck _“Scan for Netbeans project after"_. Wait for checkout completion.
  1. Create a project with existing source (_New project-> Java -> Java Project with Existing Sources_). Name the project _'itSIMPLE'_. The project folder can be created in the **Netbeans Projects** folder. As for the source, point to the folder that where you checked out the code (the _‘itSIMPLEsrc’_).
  1. Add the **JAR/ZIP libraries** to the project (right click over _Libraries -> Add Jar/Folder_). Selected all .jar libraries). They will be in the folder _.../itSIMPLEsrc/lib_.
  1. Copy and paste the following folders _‘resource’_, _‘myPlanners’_, _‘myIcons’_, _‘myValidators’_, and _‘myAnalyzers’_ from the _itSIMPLEsrc_ folder into the project folder created by **Netbeans** (e.g., _NetbeansProjects/itSIMPLE_). This is necessary for running itSIMPLE inside the Netbeans environment.
  1. Run the class **ItSIMPLE.java**.


## Planners ##

### Planners currently compatible with itSIMPLE ###
The current version of itSIMPLE (version 4.0) is compatible with the following planners:

  * Metric-FF (windows and linux). [xxl.htmlhttp://members.deri.at/~joergh/ff.html](http://andorfer.cs.uni-dortmund.de/~edelkamp/mips/mips-)
  * FF (v2.3) (linux). http://members.deri.at/~joergh/ff.html
  * SGPlan 5.2.2 (linux). http://manip.crhc.uiuc.edu/programs/SGPlan/index.html
  * SGPlan 6 (linux). http://ipc.informatik.uni-freiburg.de/Planners/
  * MIPS-xxl 2006 (linux). http://andorfer.cs.uni-dortmund.de/~edelkamp/mips/mips-xxl.html
  * MIPS-xxl 2008 v1.1 (linux). http://sjabbar.com/mips-xxl-planner
  * SATPlan 2006 v1.1 (linux). http://www.cs.rochester.edu/u/kautz/satplan/index.htm
  * LPG-td 1.0 (windows and linux). http://lpg.ing.unibs.it
  * LPG 1.2 (linux). http://prometeo.ing.unibs.it/lpg/
  * hspsp 2008 (linux). http://ipc.informatik.uni-freiburg.de/Planners/
  * Plan-A 1.0 (linux). http://ipc.informatik.uni-freiburg.de/Planners/
  * Blackbox v4.3 (linux) and v4.2 (Windows). http://www.cs.rochester.edu/u/kautz/satplan/blackbox/
  * Maxplan? 2006. http://www.cse.wustl.edu/~chen/maxplan/
  * LPRPG Public Release 2. http://planning.cis.strath.ac.uk/LPRPG/
  * Marvin Release 1 (2004). http://planning.cis.strath.ac.uk/Marvin/