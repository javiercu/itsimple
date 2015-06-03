# Frequently Asked Questions (FAQ) #

The following list contains the most common questions about the itSIMPLE
tool and project.

If your question isn't already in this list, please tell us what it is.


## How can I install itSIMPLE? ##

Linux:
  1. Check if you have the lastest version of Java Runtime installed (e.g., JRE 6, http://java.sun.com). You can check your version by typing "java -version" in a terminal;
  1. Download itSIMPLE;
  1. Unzip the file;
  1. Change permission (e.g. chmod +x itSIMPLE.jar);
  1. Run the software: java -jar itSIMPLE.jar
  1. If you have any problems with GUI look and feel change it for Metal in Settings-&gt;Appearance-&gt;Metal.

Windows (XP/Vista):
  1. Check if you have the lastest version of Java Runtime installed (e.g., JRE 6, http://java.sun.com/);
  1. Download itSIMPLE;
  1. Unzip the file;
  1. Run the software in command line (java -jar itSIMPLE.jar) or double-click on itSIMPLE.jar file

## Does itSIMPLE run on Linux, Windows and Mac? ##

Yes, itSIMPLE is a java-based software and run in Windows, linux and Mac.

## How can I add icons and use them in the diagrams? ##

You can add your own icons to the itSIMPLE and use them in the Usecase, Class, State Machine diagrams. In order to add an icon just paste it into the folder: itImages\Icons. We recomend to use .png icons (48x48, 32x32).

## How do I add a planner to itSIMPLE? ##

itSIMPLE is integrated to several AI planner such as Metric-FF, FF, SGPlan, MIPS-xxl, SATPlan, LPG-td, LPG, hspsp. In order them to work properly you have to download the planners (check README.txt) that are not distributed with itSIMPLE and paste them in the folder 'myPlanners/'. Open the file itPlanners.xml (located in resources/planners) and check the file name that you have to use.

If you wish your planner were connected to itSIMPLE or if you would like to see a planner integrated to the tool, please send us an email (tiago.vaquero (at) poli.usp.br) so we can help you with that. In fact, we just need to properly register the planner in a specific file (itPlanners.xml).

## What planners are currently compatible with itSIMPLE? How can I obtain them? ##

The current version of itSIMPLE (version 3.0) is compatible with the following planners:

  * Metric-FF (windows and linux). [http://andorfer.cs.uni-dortmund.de/~edelkamp/mips/mips-xxl.htmlhttp://members.deri.at/~joergh/ff.html]
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
  * Maxplan 2006. http://www.cse.wustl.edu/~chen/maxplan/
  * LPRPG Public Release 2. http://planning.cis.strath.ac.uk/LPRPG/
  * Marvin Release 1 (2004). http://planning.cis.strath.ac.uk/Marvin/

Some of these planners are available with the tool. The others can be downloaded from their webpage.


## How can I set up itSIMPLE in Eclipse or Netbeans for development? ##

**Eclipse**

  1. Check out itSIMPLE project (Repository folder: https://itsimple.googlecode.com/svn/trunk/) to a local folder in your computer, e.g. in a folder called ‘itSIMPLEsrc’ (not in the workspace folder of Eclipse). Wait for checkout completion.
  1. Create a new project (New-> Java Project). Name the project 'itSIMPLE'. Press Next and on the Source tab press "Link Additional source to the project". Chose the 'itSIMPLEsrc' folder were the checkout was done.
  1. Add the JAR/ZIP libraries to the project (right click over the project -> Properties -> Java Build Path and on the Libraries tab press Add external Jars). Selected all .jar libraries. They will be in the folder .../itSIMPLEsrc/lib
  1. Copy and paste the following folders ‘resource’, ‘myPlanners, ‘myIcons’, ‘myValidators’, and  ‘myAnalyzers’ from the itSIMPLEsrc folder into the project folder created by Eclipse (e.g., workspace/itSIMPLE). This is necessary for running itSIMPLE inside the Eclipse environment.
  1. Run the class ItSIMPLE.java.

**Netbeans**

  1. Check out itSIMPLE project (team->checkout; Repository folder: https://itsimple.googlecode.com/svn/trunk/) to a local folder in your computer, e.g. in a folder called ‘itSIMPLEsrc’ (not in the NetBeansProjects folder). Uncheck “Scan for !Netbeans project after". Wait for checkout completion.
  1. Create a project with existing source (New project-> Java -> Java Project with Existing Sources). Name the project 'itSIMPLE'. The project folder can be created in the NetbeansProjects folder. As for the source, point to the folder that where you checked out the code (the ‘itSIMPLEsrc’).
  1. Add the JAR/ZIP libraries to the project (right click over Libraries -> Add Jar/Folder). Selected all .jar libraries). They will be in the folder .../itSIMPLEsrc/lib
  1. Copy and paste the following folders ‘resource’, ‘myPlanners, ‘myIcons’, ‘myValidators’, and  ‘myAnalyzers’ from the itSIMPLEsrc folder into the project folder created by Netbeans (e.g., NetBeansProjects/itSIMPLE). This is necessary for running itSIMPLE inside the Netbeans environment.
  1. Run the class ItSIMPLE.java.