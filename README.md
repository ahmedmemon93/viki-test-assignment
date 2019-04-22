# viki-test-assignment
Test Assignment for Viki

Question to solve:
Using any language of your choice write a script that does the following:
Call http://api.viki.io/v4/videos.json?app=100250a&per_page=10&page=1
To go to next page of response you have to increment the page number in the above url.
As long as the “more” field returns true, you have more data available.
The response is a JSON object which has a response key which is an array of more JSON objects. Each of them has a key called flags and within flags there is a key called hd. Print out how many response objects have flags:hd set to true and how many have hd set to false. Check-in your codeonto GitHub and share the link.


*** Solution ***
In this problem I have used restAssured to solve the problem.
In order to execute the code. follow below given steps:
1. Clone the repository from https://github.com/ahmedmemon93/viki-test-assignment
2. Make sure mvn is installed on your computer to run the program via test command.
3. (if mvn is installed) go to viki-test-assignment project and open cmd there. run following command.
    mvn clean test
It will take some time to get response as number of pages are more to check.
4. If mvn is not installed then you can open the project using intellij and run test method. Follow below steps to run from ide
    1. Go to viki-test-assignment double click on pom.xml file to open it in intellij.
    2. Once all dependencies are downloaded then open to TestVideoAPI.java test class
    3. Right click on testCountOfHdVideos method and run testCountOfHdVideos()

