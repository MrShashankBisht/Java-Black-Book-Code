def student=[:]
println "Adding Key/Value pairs..."
//Setting Values
student.put("rollno", 101)
student["name"]="John"
student.age=18
println "The number of key/value pairs in the Map is: ${student.size()}"
println "Student Information"
//Fetching valued from the Map
println "Roll No: ${student.get('rollno')}"
println "Name: ${student['name']}"
println "Age: ${student.age}"
//Iterating over the key/value pairs.
println "Student Information using iteration"
student.each() { k,v-> println "${k}->${v}" }
