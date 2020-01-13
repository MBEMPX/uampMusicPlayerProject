# uampMusicPlayerProject
This is a uamp android music player project

HOW TO RUN THE FRAMEWORK

	- RUN USING JENKINS
		prerequisite
		1. Ensure you have started appium from command propmt
		    - to start appium: open cmd and type "appium" to start appium server
			
		2. Ensure you have started your emulator using command prompt or android studio
		    - to start emulator: open cmd and type the below commands
			    1. cd C:\Users\MBEMPX\AppData\Local\Android\Sdk\emulator (Change username from this path to your username)
				2. emulator -avd (Specify your emulator name without brackets)
		
		3. Open the TestNG.xml file under TestSuit folder from the project repository
			- Find file on this repository (https://github.com/MBEMPX/uampMusicPlayerProject.git)
			- Change deviceName parameter value to your emulator name
			- Change URL parameter value to have your own URL
			
		4. From Jenkins do the following:
			- Create a new Item/Project by clicking on New item
			- Enter the item name
			- Select "Freestyle project"
			- Click OK button at the bottom
			- On the next window go to Source Code Management and select Git
			- Paste this URL repository (https://github.com/MBEMPX/uampMusicPlayerProject.git)
			- Under Build menu, type pom.xml on the Root POM
			- On Goals and options text field, type mvn clean install.
			
		5. Click Apply and Save button at the bottom
		6. Click Build now from your left hand menu
		
	- RUN USING THE COMMAND PROMPT FROM YOUR LOCAL MACHINE
		
		1. Download the project to your local machine using the following steps
			- Open your browser and past this URL: https://github.com/MBEMPX/uampMusicPlayerProject.git
			- Click on Clone or download button from git hub
			- Download as Zip folder and extract it from your local machine
		
		2. Open the TestNG.xml file under TestSuit folder from the project repository
			- Locate the TestNG.XML file in this directory(\\uampProject\TestSuit)
			- Open with notepad
			- Change deviceName parameter value to your emulator name
			- Change URL parameter value to have your own URL and save it
			
		3. Execute tests from command line
			- locate run.bat file from this directory(\\uampProject)
			- Double click on it and the tests should start execution
			
			
			
		
