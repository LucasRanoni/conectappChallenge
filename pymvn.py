import sys
import os


from os.path import exists

cantArg = len(sys.argv)
argument = None
command = "mvn clean package"

versionPath = "./src/main/resources/version.properties"
keep = ("keep",-1,"it does not change version w.x.y.z")
positionY = ("mayor",2,"it change version version w.x.y+1.z")
positionZ = ("minor",3,"it change version version w.x.y.z+1")

def readFile():
	content = None
	if exists(versionPath) :
		file = open(versionPath,"r")
		try:
			content = file.readline()
		except error:
			print(error)	
		finally:	
			file.close()
	else:
		print("File not found, file:", versionPath)
	return content

def writeFile(newContent):
	file = open(versionPath,"w")
	try:
		file.write(newContent)
	finally:	
		file.close()	

def getNewVertion(oldVersion, action):
	print(" the old version is: ", oldVersion)
	version = oldVersion.replace("VERSION = ","")
	numbers = version.split('.')
	if ( action >= 0) and (action < len(numbers) ): 
		for i in range(action + 1, len(numbers)):
			numbers[i] = "0"
		numbers[action] = str( int(numbers[action]) + 1 )
		version = "VERSION = " + numbers[0] + "." + numbers[1] + "." + numbers[2] + "." + numbers[3]
		print(" the new version is: ",version)
	else:	
		print(" Invalid index for version ", action)
	return version

print("Starded ")
if cantArg == 2 :
	
	action = -2
	argument = sys.argv[1]
	if argument == keep[0]:
		action = keep
	elif argument == positionY[0]:
		action = positionY
	elif argument == positionZ[0]:
		action = positionZ
	
	if action != -2 :	
		print(" you are selected ", action[0], " : ", action[2])		
		if action[1] >= 0:
			content = readFile()
			if content != None:
				content = getNewVertion(content, action[1])
				writeFile(content)
		os.system(command)
	else:
		print(" Command not recognized, try '", sys.argv[0],"'")	

else:
	print("To change the version you can put")
	print(" * ",keep[0],": ",keep[2])
	print(" * ",positionY[0],": ",positionY[2])
	print(" * ",positionZ[0],": ",positionZ[2])

