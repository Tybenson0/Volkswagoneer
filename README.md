<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.

## Hi :)

C.  I decided to make a webpage for volkswagen vehicles and their associated parts. I added custom styles and worked alongside 
bootstrap to make the theme match. I also styled the other pages for adding and removing products or parts to make sure
they look good as well. The files I modified are Demo.css, mainscreen.html, InhousePartForm.html, OutsourcedPartForm.html, and
ProductForm.html.

D.   I made the about page and added the HTML to the same templates folder. The about page has a title (line 22), some 
decorations including a logo (lines: 21,23), and a brief description (lines 24-34). I also made a new controller called aboutController
to allow linkage between the pages. The changes were made in about.html, and aboutController.java

E. Added a sample inventory consisting of Volkswagen parts and products consisting of volkswagen cars in the BootStrapDAta.java
on lines 45 - 91.

F.  In mainscreen.html I modified lines 100-102 by adding a new "buy now" button. I made a new controller called buyItem,
which has two conditions. the first checks if the inventory is above 0 and if it is, the inventory decreases by 1 and is saved 
with purchaseSuccess.html being returned. The other case triggers if the inventory is 0, which just returns purchaseFailure.html.

G.  Added minInv and maxInv fields in the part class, along with adding them to a constructor and gave them each getters and
setters respectively. (Lines: 32-36, 57-58, 93-106). Added minimum and maximum fields to the sample inventory. 
(Lines: 51,52,60,61,69,70,78,79,87,88). Added the additional fields to the inhouse (lines: 30-33) and outsource forms (Lines: 30-33)
respectively. Renamed the storage file to "renamedStorage." Lastly, I modified my inhouse and outsourced part controllers to 
include a test case that use the new checkValidinv method to verify the current inventory is between the min and max. (Lines: 42-44).
From there the html is returned if it fails and a new message stating an error with the current inventory is displayed. 
OutsourcedPartsForm.html (Line 29), InhousePartForm.html (line 29).

H.  For this task I modified the inHousePartForm.html and OutsourcedPartForm.html so that it displays a message warning when the
 inventory is below the minimum, and a different message for when the inventory is above the maximum. (Lines: 29-30). And for updating
the products, I modified the productForm.html so that when the inventory is at the minimum, it shows that the part can't be 
added because it would put the inventory below the minimum. Lines(58-59).

I.  In PartTest.java, I added 2 unit tests for each minimum and maximum field respectively, one for getting the value, and one
for setting the value. (Lines: 104-137).

J.  There was only one unused validator and that was DeletePartValidator.java, so I removed that one since it is not being used
and is just taking up space.

K.  
